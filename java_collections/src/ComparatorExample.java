import java.util.*;

class MarkSheet {
    String name;
    int marks;

    MarkSheet(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<MarkSheet> students = new ArrayList<>();
        students.add(new MarkSheet("Alice", 85));
        students.add(new MarkSheet("Bob", 92));
        students.add(new MarkSheet("Charlie", 78));

        // Sort by name
        Comparator<MarkSheet> nameComparator = new Comparator<MarkSheet>() {
            @Override
            public int compare(MarkSheet s1, MarkSheet s2) {
                return s1.name.compareTo(s2.name);
            }
        };

        Collections.sort(students, nameComparator);
        System.out.println("Sorted by name: " + students);

        // Sort by marks (descending) using lambda
        students.sort((s1, s2) -> s2.marks - s1.marks);
        System.out.println("Sorted by marks (desc): " + students);
    }
}