import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name = "";
        int age = 0;
        char gender = ' ';
        char result = ' ';
        float height, weight;


        System.out.print("당신의 이름은 ?");
        name = keyboard.nextLine();
        System.out.printf("%s님의 나이는 ?", name);
        age = keyboard.nextInt();
        System.out.printf("%s님의 성별(남 = M, 여 = F) ?", name);
        gender = keyboard.nextLine().charAt(0);
        System.out.printf("%s님의 성별(남 = M, 여 = F) ?", name, age, gender);
        System.out.printf("%s님의 키는 %s Cm입니까 ?");
        height = keyboard.nextFloat();
        System.out.printf("%s님의 몸무게는 %s Kg입니까 ?");
        weight = keyboard.nextFloat();
    }
}