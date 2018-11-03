package schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.persons;

public class Learner extends Participant {
    Parent[]parents;

    public Parent[] getParents() {
        return parents;
    }

    public void setParents(Parent[] parents) {
        this.parents = parents;
    }
}
