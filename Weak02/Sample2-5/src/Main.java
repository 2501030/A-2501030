import java.io.PrintStream;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
        String name = "";
        short age = 0;
        float height = 0;
        double weight = 0;


        System.out.print(" 당신의 이름은 ? ");
        name = keyboard.nextLine();
        System.out.printf(" %s님의 나이는 ? ");
        age = keyboard.nextShort();
        System.out.printf(" %s님의 키는 ? ", name);





        System.out.printf("%s님의 나이는 %f 입니다.");
                        System.out.printf("%s님의 키는 %f Cm 입니다.\n", name, height);
        System.out.printf("%s님의 몸무게는 &f kg 입니다.\n", name, weight);
    }
}