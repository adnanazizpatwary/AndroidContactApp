package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class personAdapter extends ArrayAdapter<ContactPerson>{
    private Context context;
    private ArrayList<ContactPerson> persons;

    public personAdapter(@NonNull Context context,
                         ArrayList<ContactPerson> persons)
    {
        super(context,R.layout.roelayout,persons);
        this.context = context;
        this.persons=persons;
    }
    class Viewholder{
        TextView mameTv ;
        TextView phoneTv;
        ImageView imageViewTv;
        ImageView statusIv;

    }


    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context
                        .LAYOUT_INFLATER_SERVICE);
        Viewholder holder;
        if(convertView==null) {
            holder = new Viewholder();
            convertView = inflater.inflate(R.layout.roelayout, parent,
                    false);
            holder.mameTv = convertView.findViewById(R.id.myname);
            holder.phoneTv = convertView.findViewById(R.id.myphone);
            holder.imageViewTv = convertView.findViewById(R.id.myimage);
            holder.statusIv = convertView.findViewById(R.id.statusIcon);
            convertView.setTag(holder);
        } else{
            holder = (Viewholder) convertView.getTag();
        }
        holder.mameTv.setText(persons.get(position).getPersonName());
        holder.phoneTv.setText(persons.get(position).getPhoneNumber());
        holder.imageViewTv.setImageResource(persons.get(position).getImg());


        if(persons.get(position).getStatus().toLowerCase().equals("available")) {
            holder.statusIv.setImageResource(R.drawable.available_status);
        } else if (persons.get(position).getStatus().toLowerCase().equals("busy")) {
            holder.statusIv.setImageResource(R.drawable.status_busy);
            
        } else if (persons.get(position).getStatus().toLowerCase().equals("offline")) {
            holder.statusIv.setImageResource(R.drawable.status_offline);
            
        }else {
            holder.statusIv.setImageResource(R.drawable.available_status);

        }



        return convertView;


    }
}
