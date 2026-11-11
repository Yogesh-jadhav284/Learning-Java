package Constructor;

public class overLoadedConsturctorExample {
    public static void main(String[] args){
        Person p1 = new

                Person("yogesh", 28);
        System.out.println(p1);
    }

}
class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name  = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
