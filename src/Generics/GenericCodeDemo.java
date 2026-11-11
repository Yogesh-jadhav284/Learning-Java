package Generics;

public class GenericCodeDemo {
    public static void main(String[] args){
    GenericPair<String,Integer> stringIntpair = new GenericPair<>("Hello", 28);

    String name= (String)stringIntpair.getFirst();
    int age = (Integer) stringIntpair.getSecond();
        System.out.println(name);
        System.out.println(age);
}
        }