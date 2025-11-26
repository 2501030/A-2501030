import java.util.Scanner;

public class Input {
    static Scanner keyboard = new Scanner(System.in);

    public static void readData(String[][] students, int[][] heigth) throws Exception {
        int i = 0;
        while (i < students.length) {
            System.out.printf("%s 학생의 키 입력 : ", students[i][0]);
            heigth[i][0] = keyboard.nextInt();
            if (heigth[i][0] >= 30 && heigth[i][0] < 230)
                i++;
            else {
                System.err.println("ERROR : 30 ~ 230");
                System.in.read();
            }
        }
    }

    public static void readData(String[][] students, float[][] weigth) throws Exception {
        int i = 0;
        while (i < students.length) {
            System.out.printf("%s 학생의 몸무게 입력 : ", students[i][0]);
            weigth[i][0] = keyboard.nextInt();
            if (weigth[i][0] >= 30 && weigth[i][0] < 230)
                i++;
            else {
                System.err.println("ERRoR : 30 ~ 230");
                System.in.read();
            }
        }
    }
}
