import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Define natural ordering by marks
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks; // Ascending order
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));

        Collections.sort(students); // Uses compareTo method
        System.out.println(students); // Sorted by marks
    }
}