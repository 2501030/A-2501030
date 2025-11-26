public class Output {
    public static void display(String[][] students, int[][] heigth, float[][] weigth) {
        display();
        System.out.println(" 이름  성별  키  체중  표준 체중  BMI  판정");
        display();
        for (int i = 0; i < heigth.length; i++) {
            System.out.printf(" %3s %1s %3d Cm %5.1f kg %5.1f kg %5.1f %s\n", students[i][0], students[i][1], heigth[i][0],
                    heigth[i][1], heigth[i][2], weigth[i][0], weigth[i][1], weigth[i][2], students[i][2]);
        }
    }

    private static void display() {
        System.out.println("**********************");
    }
}
