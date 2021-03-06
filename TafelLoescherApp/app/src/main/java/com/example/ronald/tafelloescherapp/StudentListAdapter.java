package com.example.ronald.tafelloescherapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ronald on 2/21/2018.
 */

public class StudentListAdapter extends ArrayAdapter<Student>{

    private ArrayList<Student> list;

    public StudentListAdapter(Context context, ArrayList<Student> list) {
        super(context, R.layout.item_student, list);
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_student, null);
        }

        Student student = list.get(position);
        TextView textView = view.findViewById(R.id.txt_item_student);
        textView.setText(student.getName());

        return view;
    }



    public Student getItemAtPostion(int i)
    {
        return list.get(i);
    }
}
