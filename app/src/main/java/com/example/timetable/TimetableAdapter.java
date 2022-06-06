package com.example.timetable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TimetableAdapter extends RecyclerView.Adapter<TimetableAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Timetable> timetables;

    TimetableAdapter(Context context, List<Timetable> states) {
        this.timetables = states;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.activity_timetable_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TimetableAdapter.ViewHolder holder, int position) {
        Timetable schedule = timetables.get(position);

        holder.txtDayOfWeek.setText(schedule.getDayOfWeek());
        holder.txtBuild.setText(schedule.getBuild());

        for (int i = 0; i<5; i++){
            holder.tableTxts[i][0].setText(String.valueOf(i + 1));
        }
        for (int i = 0; i<5; i++){
            try{
                holder.tableTxts[i][1].setText(schedule.getLessons()[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return timetables.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView txtDayOfWeek, txtBuild;
        TextView[][] tableTxts = new TextView[5][2];
        ViewHolder(View view){
            super(view);
            txtDayOfWeek = view.findViewById(R.id.txtDayOfWeek);
            txtBuild = view.findViewById(R.id.txtBuild);

            for (int i = 0; i<5; i++){
                for (int y = 0; y < 2; y++){
                    String txtID = "txt" + i + y;
                    int resultID =  view.getResources().getIdentifier(txtID, "id",
                            "com.example.timetable");
                    tableTxts[i][y] = view.findViewById(resultID);
                }
            }
        }
    }
}
