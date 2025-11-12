import java.util.Scanner;

import static sun.nio.cs.Surrogate.MAX;
import static sun.nio.cs.Surrogate.MIN;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        boolean swapped = false;
        String[] name = {"홍길동", "이재명", "윤석열", "경복대", "오세훈"};
        float[] weigth = new float[name.length];
        int i = 0;
        while (i < name.length) {
            System.out.printf("%s님의 몸무게 입력 : ", name[i]);
            weigth[i] = keyboard.nextFloat();

            int[] weight;
            if (weigth[i] >= MIN && weigth[i] <= MAX)
                i++;
            else {
                System.out.printf("ERROR : %.1f ~ %.1f");
                System.in.read();
            }
        }

        for (i = 0; i < i - 1; i++) {

            for (int j = 0; j < i - 1 - i; j++) {
                int[] arr = new int[0];
                int temp = arr[i];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped);
    }
}