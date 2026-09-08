// Comparable  and comparesTo
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;
    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        if (this.name.length() > other.name.length()) {
            return 1;
        } else if (this.name.length() < other.name.length()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
}
public class Demo3 {
    public static void main(String[] args) {
        List <Student> students = new ArrayList<Student>();
        students.add(new Student(20, "Alice"));
        students.add(new Student(22, "Bob"));
        students.add(new Student(19, "Charlie"));
        students.add(new Student(19, "David"));
        students.add(new Student(21, "Eve"));
        
        Collections.sort(students);
        System.out.println(students);

        
        
    }
}