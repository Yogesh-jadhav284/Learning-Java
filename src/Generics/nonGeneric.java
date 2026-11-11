package Generics;

public class nonGeneric {
    public static void main (String[] args){
        Pair p1 = new Pair("Hello", 28);
        p1.setFrist(16);
         String name= (String)p1.getFirst();
         int age = (Integer) p1.getSecond();
        System.out.println(name);
        System.out.println(age);
    }
}
