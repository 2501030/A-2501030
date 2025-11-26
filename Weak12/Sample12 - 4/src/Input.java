import java.util.Scanner;

public class Input {
    public static void readData(int[] data) {
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.print("%d번째 Data 입력 : ");
            data[i] = keyboard.nextInt();
        }
    }
}
