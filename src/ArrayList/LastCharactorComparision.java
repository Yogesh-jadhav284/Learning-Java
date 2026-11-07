package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LastCharactorComparision {

    public static void main(String[] args) {

        var countries = new ArrayList<String>();

        countries.add("India");
        countries.add("Japan");
        countries.add("chian");
        countries.add("France");
        countries.add("USA");

//        countries.sort(new LastCharComparator());
        Collections.sort(countries, new LastCharComparator());

        System.out.println(countries);
    }
}

class LastCharComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        char lastChar1 = o1.charAt(o1.length() - 1);
        char lastChar2 = o2.charAt(o2.length() - 1);

        return Character.compare(lastChar1, lastChar2);
    }
}