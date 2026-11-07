import java.util.ArrayList;
import java.util.Comparator;

public class sortingColeeectionDemo {
    public static void main (String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("India");
        names.add("china");
        names.add("japan");
        names.add("france");
        System.out.println(names);
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
        names.sort(Comparator.reverseOrder());
        System.out.println(names);
    }
}
