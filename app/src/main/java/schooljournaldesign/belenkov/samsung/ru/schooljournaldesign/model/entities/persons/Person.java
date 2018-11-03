package schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.persons;

public abstract class Person {
    protected String fullname;
    protected String phone;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
