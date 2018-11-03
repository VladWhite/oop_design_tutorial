package schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.persons;

import java.io.Serializable;

public class Teacher extends Person implements Serializable {
    protected String position;
    protected String qualification;
    protected String name;
    protected String phone;

    public Teacher(String name, String phone, String position, String qualification) {
        this.position = position;
        this.qualification = qualification;
        this.name = name;
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String getFullname() {
        return name;
    }

    @Override
    public void setFullname(String fullname) {
       this.fullname = name;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
      this.phone = phone;
    }
}
