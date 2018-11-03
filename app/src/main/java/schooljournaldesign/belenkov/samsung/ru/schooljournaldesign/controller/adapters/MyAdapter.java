package schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.controller.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.R;
import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.controller.TeacherActivity;
import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.persons.Teacher;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Teacher[] teachersList;
    private Context applicationContext;

    public MyAdapter(Teacher[]teachersList, Context applicationContext) {
        this.teachersList = teachersList;
        this.applicationContext = applicationContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view  = LayoutInflater.
                from(viewGroup.getContext())
                .inflate(R.layout.teachers_view, viewGroup, false);
        return new MyViewHolder(view, applicationContext);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.bind(teachersList[i]);
    }

    @Override
    public int getItemCount() {
        return teachersList.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView teacherName;
        public TextView teacherQualification;
        public TextView teacherPosition;
        public TextView teacherPhone;

        private Context context;

        public MyViewHolder(View itemView, final Context context) {
            super(itemView);
            teacherName = itemView.findViewById(R.id.teacherNameView);
            teacherQualification = itemView.findViewById(R.id.teacherQualificationView);
            teacherPosition = itemView.findViewById(R.id.teacherPositionView);
            teacherPhone = itemView.findViewById(R.id.teacherPhoneView);
            this.context = context;
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    context.startActivity(new Intent(context, TeacherActivity.class));
                }
            });
        }

        public void bind(Teacher teacher){
            teacherName.setText(teacher.getFullname());
            teacherQualification.setText(teacher.getQualification());
            teacherPosition.setText(teacher.getPosition());
            teacherPhone.setText(teacher.getPhone());
        }
    }
}
