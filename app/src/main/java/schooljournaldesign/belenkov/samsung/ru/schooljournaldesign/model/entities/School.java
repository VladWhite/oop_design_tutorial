package schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities;

import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.data_providers.SchoolDataProvider;
import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.classes.Class;
import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.classes.Elective;
import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.classes.Section;
import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.persons.Employee;
import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.persons.Learner;
import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.persons.Teacher;

public class School {
    protected Employee[] employees;

    protected Teacher[] teachers;

    protected Learner[] learners;

    protected Class[] classes;

    protected Elective[] electives;

    protected Section[] sections;

    protected String address;

    protected String name;

    public School(Employee[] employees, Teacher[] teachers, Learner[] learners, Class[] classes, Elective[] electives, Section[] sections, String address, String name) {
        this.employees = employees;
        this.teachers = teachers;
        this.learners = learners;
        this.classes = classes;
        this.electives = electives;
        this.sections = sections;
        this.address = address;
        this.name = name;
    }

    public School() {
        setTeachers(SchoolDataProvider.getTeachers());
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Learner[] getLearners() {
        return learners;
    }

    public void setLearners(Learner[] learners) {
        this.learners = learners;
    }

    public Class[] getClasses() {
        return classes;
    }

    public void setClasses(Class[] classes) {
        this.classes = classes;
    }

    public Elective[] getElectives() {
        return electives;
    }

    public void setElectives(Elective[] electives) {
        this.electives = electives;
    }

    public Section[] getSections() {
        return sections;
    }

    public void setSections(Section[] sections) {
        this.sections = sections;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
