import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int first, second;
        int result;

        first = Input.readData("첫번째 데이터 입력 : ");
        second = Input.readData("두번째 데이터 입력 :");
        /* System.out.print("첫번째 데이터 입력 :");
          first = keyboard.nextInt();
          System.out.print("두번째 데이터 입력 :");
          second = keyboard.nextInt(); */

        result = Compute.add(first, second);
        Output.display(first, second, result);
    }
}