package ExceptionHandeling;

import java.util.Objects;

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
    @Override
    public int hashCode(){
     return Objects.hash(gender, name, age, ssn);
    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null){
            return false;
        }
        if (getClass() != o.getClass()){
            return  false;
        }
        ChatGpt chatGpt = (ChatGpt) o;
         return age == chatGpt.age &&
                ssn == chatGpt.ssn &&
                gender == chatGpt.gender &&
                Objects.equals(name, chatGpt.name);
    }

    @Override
    public String toString() {
        return "ChatGpt{" +
                "age=" + age + "," +
                " name='" + name + '\'' +
                ",  ssn=" + ssn +
                '}';
    }
}
