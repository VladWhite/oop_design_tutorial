package schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.R;
import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.controller.adapters.MyAdapter;
import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.persons.Teacher;

public class TeachersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);
        Teacher[] teachersList = (Teacher[]) getIntent().getSerializableExtra("teachers");

        RecyclerView teachersRecyclerView = findViewById(R.id.teachersRecyclerView);
        teachersRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        teachersRecyclerView.setAdapter(new MyAdapter(teachersList, this));
    }
}
