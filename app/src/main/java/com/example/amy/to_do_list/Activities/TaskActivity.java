package com.example.amy.to_do_list.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.amy.to_do_list.Db.Helpers.TaskDbHelper;
import com.example.amy.to_do_list.R;
import com.example.amy.to_do_list.Models.Task;

public class TaskActivity extends AppCompatActivity {
    TextView taskName, taskDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        Intent intent = getIntent();
        Task selectedTask = (Task) intent.getSerializableExtra("task");

        taskName = findViewById(R.id.taskName);

        String name = selectedTask.getTaskName();
        taskName.setText(name);

        taskDetails = findViewById(R.id.taskDetails);
        String details = selectedTask.getDescription();
        taskDetails.setText(details);
    }
}
