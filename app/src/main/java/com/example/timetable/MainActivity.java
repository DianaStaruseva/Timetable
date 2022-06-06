package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Timetable> timetables = new ArrayList<>();
    RecyclerView recyclerView;
    TimetableAdapter adapter;
    Button btn;
    boolean ch = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        SetDataNumerator();

        recyclerView = findViewById(R.id.list);
        adapter = new TimetableAdapter(this, timetables);
        recyclerView.setAdapter(adapter);

        btn.setOnClickListener(v -> {

            if(ch){
                SetDataNumerator();
                btn.setText("Числитель");
                btn.setBackgroundColor(Color.RED);
                btn.setTextColor(Color.WHITE);
            }else{
                SetDataDenominator();
                btn.setText("Знаменатель");
                btn.setBackgroundColor(Color.BLUE);
                btn.setTextColor(Color.WHITE);
            }
            ch = !ch;
            adapter.notifyDataSetChanged();
        });
    }

    private void SetDataNumerator() {
        timetables.clear();
        timetables.add(new Timetable("Нахимовский", "Понедельник",
                new String[]{
                        "","Системное програмирование",
                        "Разработка программных модулей",
                        "Разработка мобильных \nприложений",
                        "Физическая культура"}));
        timetables.add(new Timetable("", "Вторник",
                new String[]{
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА"}));
        timetables.add(new Timetable("", "Среда",
                new String[]{
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА"}));
        timetables.add(new Timetable("Неженская", "Четверг",
                new String[]{
                        "Инструментальные средства разработки \nПО",
                        "Технология разработки программного \nобеспечения",
                        "Иностарнный язык в \nпрофессиональной деятельности",
                        "Техонология разработки и защиты \nбаз дынных"}));

        timetables.add(new Timetable("Нахимовский", "Пятница",
                new String[]{
                        "", "Системное программирование",
                        "Разработка программных модулей",
                        "Технология разработки \nпрограммного обеспечения",
                        "Разработка мобильных приложений"}));
    }

    private void SetDataDenominator(){
        timetables.clear();
        timetables.add(new Timetable("Нахимовский", "Понедельник",
                new String[]{
                        "","Техонология разработки и защиты \nбаз дынных",
                        "Разработка программных модулей",
                        "Разработка программных модулей",
                        "Физическая культура"}));
        timetables.add(new Timetable("-", "Вторник",
                new String[]{
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА"}));
        timetables.add(new Timetable("-", "Среда",
                new String[]{
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА"}));
        timetables.add(new Timetable("Неженская", "Четверг",
                new String[]{
                        "Инструментальные средства разработки \nПО",
                        "Технология разработки \nпрограммного обеспечения",
                        "Иностарнный язык в \nпрофессиональной деятельности",
                        "Техонология разработки и защиты \nбаз дынных"}));

        timetables.add(new Timetable("Нахимовский", "Пятница",
                new String[]{
                        "", "Системное программирование",
                        "Разработка программных модулей",
                        "Инструментальные средства \nразработки ПО",
                        "Разработка мобильных приложений"}));
    }
    }