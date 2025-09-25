import java.util.Scanner;

public class Main {
    private static int Scanner;

    public static void main(String[] args) {
                 Scanner keyboard = new Scanner(System.in);
        Object name = null;
        String address;
        Object String = name;
        int age;

        System.out.println("당신의 이름은 ?");
        name = keyboard.nextLine();
        System.out.println();
        age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.printf("%s님의 주소는 ? ", name);
        address = keyboard.nextLine();

        System.out.printf("\n&s님의 나이는 %d살 입니다.\n", name, age);
        System.out.printf("\n&s님의 나이는 %d살 입니다.\n", name, age);


        System.out.printf("이름 :", name);
        System.out.printf("나이 :", name);
        System.out.printf("주소 : ", address);
    }
}