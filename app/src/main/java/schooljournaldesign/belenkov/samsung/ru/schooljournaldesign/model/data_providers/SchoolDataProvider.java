package schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.data_providers;

import schooljournaldesign.belenkov.samsung.ru.schooljournaldesign.model.entities.persons.Teacher;

public class SchoolDataProvider {
    public static Teacher[] getTeachers() {
        return new Teacher[]{
                new Teacher("Ivanov", "1-2-3-4-5", "teacher", "Mathematical"),
                new Teacher("Petrov", "1-2-3-4-5", "teacher", "Physics"),
                new Teacher("Sidorov", "1-2-3-4-5", "teacher", "Chemical"),
                new Teacher("Ivanov", "1-2-3-4-5", "teacher", "Mathematical"),
                new Teacher("Petrov", "1-2-3-4-5", "teacher", "Physics"),
                new Teacher("Sidorov", "1-2-3-4-5", "teacher", "Chemical"),
                new Teacher("Ivanov", "1-2-3-4-5", "teacher", "Mathematical"),
                new Teacher("Petrov", "1-2-3-4-5", "teacher", "Physics"),
                new Teacher("Sidorov", "1-2-3-4-5", "teacher", "Chemical")
        };
    }
}
