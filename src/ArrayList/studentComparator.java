package ArrayList;

import java.util.Comparator;

public class studentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int marksComparision = Integer.compare(o1.marks, o2.marks);
        if(marksComparision == 0){
            Integer.compare(o1.rollNumber, o2.rollNumber);
        }
        return marksComparision;
    }
}
