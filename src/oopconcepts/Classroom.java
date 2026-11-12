
package oopconcepts;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private final List<Student> students;

    public Classroom(List<Student> students) {
        this.students = new ArrayList<>(students);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Satyam"));

        Classroom room = new Classroom(list);

        list.add(new Student("Rahul"));

        System.out.println(
            room.getStudents().get(0).getName()
        );

        List<Student> outsideList = room.getStudents();

        outsideList.add(new Student("Hacker"));

        System.out.println(
            room.getStudents().size()
        );
    }
}
