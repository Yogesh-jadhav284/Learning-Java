import java.util.*;
import java.util.Iterator;

public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(8);
        nums.add(25);
        System.out.println(nums.get(2));
        System.out.println(nums.set(1, 10));
        System.out.println(nums);
        List<Integer> result = Collections.unmodifiableList(nums);

        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("china");
        countryNames.add("japan");
        countryNames.add("france");

        for (String name : countryNames) {
            System.out.println(countryNames);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("India");
        names.add("china");
        names.add("japan");
        names.add("france");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String country = iterator.next();
            if(country.equals("India")){
                iterator.remove();
            }
            System.out.println(country);
            System.out.println("After Iterator removal: " + names);


            ListIterator<String> roaming = names.listIterator(names.size());
            roaming.add("chile");
            while (roaming.hasPrevious()){
                String state = roaming.previous();
                System.out.println(state);
            }

        }
    }

}