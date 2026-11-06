package ExceptionHandeling;

public class HascodeEqualDemo {

    public static void main(String[] args) {
        ChatGpt gpt = new ChatGpt(28, "yogesh", 'm', 50053);
        ChatGpt gpt1 = new ChatGpt(28, "yogesh", 'm', 50053);
        System.out.println(gpt1.hashCode());
        System.out.println(gpt.hashCode());
        System.out.println(gpt.equals(gpt1));
        System.out.println(gpt);

        System.out.println(gpt1);
    }
}


