import java.util.Scanner;

public class Input {
    public static int[][] readData(String[] students) {
        Scanner keyboard = new Scanner(System.in);
        int[][] data = new int[students.length][4]; // {국어, 영어, 수학, 총점}
        String[] subject = {"국어", "영어", "수학"};
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < subject.length; j++) {
                data[i][j] = input(students[i], subject[j]);
            }
        }
        return data;


    }

    private static int input(String student, String s) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
        }
    }
}



