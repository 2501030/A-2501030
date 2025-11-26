import java.util.Scanner;

public class Input
{
    public static int readData(String s) {
        Scanner keyboard = new Scanner(System.in);
        int temp;

        System.out.print(s);
        temp = keyboard.nextInt();

        return temp;
    }
}
