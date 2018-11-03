package schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.R;
import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.School;

public class MainActivity extends AppCompatActivity {
    private School school;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        school = new School();
        school.setAddress("streen_name");
        school.setName("best school in the world");
    }

    public void goToTeachersList(View view) {
        Intent teachersIntent = new Intent(this, TeachersActivity.class);
        teachersIntent.putExtra("teachers", school.getTeachers());
        startActivity(teachersIntent);
    }
}
