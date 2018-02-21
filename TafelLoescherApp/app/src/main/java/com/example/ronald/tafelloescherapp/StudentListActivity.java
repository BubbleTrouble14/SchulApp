package com.example.ronald.tafelloescherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class StudentListActivity extends AppCompatActivity {

    ListView student_list;
    ArrayList<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        student_list = findViewById(R.id.listView_student_list);

        students.add(new Student("Ronald", "4AHMVA", "ronald.goedeke@outlook.com", "sagfasdgf"));
        students.add(new Student("Manuel", "4AHMVA", "ronald.goedeke@outlook.com", "sagfasdgf"));
        students.add(new Student("Mario", "4AHMVA", "ronald.goedeke@outlook.com", "sagfasdgf"));

        ListAdapter adapter = new StudentListAdapater(this, students);

        student_list.setAdapter(adapter);

        student_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(StudentListActivity.this, String.valueOf(4), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
