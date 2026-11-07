package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class studentToString {
    public static void main (String[] args){
        var student= new ArrayList<Student>();
        student.add(new Student("jhon",10, 97));
        student.add(new Student("wick",11,98));
        student.add(new Student("randy", 28,98));
        student.add(new Student("orton", 8,105));
        System.out.println(student);
        Collections.sort(student);
        System.out.println(student);


        var student1= new ArrayList<Student>();
        student1.add(new Student("jhon",10, 97));
        student1.add(new Student("wick",11,98));
        student1.add(new Student("randy", 28,98));
        student1.add(new Student("orton", 8,105));
        Collections.sort(student1, new studentComparator());
        System.out.println(student1);
    }
}
