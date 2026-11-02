package ExceptionHandeling;

public class ChatGpt {
private int age;
private String name;
private char gender;
private int ssn;

    public ChatGpt(int age, String name, char gender, int ssn) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.ssn = ssn;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getSsn() {
        return ssn;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
