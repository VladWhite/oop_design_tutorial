package schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.classes;

import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.persons.Learner;
import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.persons.Teacher;

public abstract class BaseClass {

    protected Learner[] learners;

    protected Teacher classTeacher;


    protected Teacher getList() {
        return classTeacher;
    }

    protected Learner[] getListParents() {
        return learners;
    }

}
