import java.util.Scanner;

public class lambadas {
    public static void main(String[] args) {
        int x=10;
        int y=70;
        String name;
        Scanner sc = new Scanner(System.in);
        name=sc.next();
//        Sayable s=() -> {
//            System.out.println("sddfgfb");
//            return y * x;
//        };
        Sayable s1=(a)->{return "Hello "+a;};
        System.out.println(s1.say(name));
//        System.out.println(z);
    }
}
