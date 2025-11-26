public class Compute {
    public static void standard(String[][] students, int[][] heigth, float[][] weigth) {
        for (int i = 0; i < weigth.length; i++) {
            if (students[i][i].equals("남")) {
                weigth[i][1] = (heigth[i][1] - 100) * 0.9f;
            } else {
                weigth[i][1] = (heigth[i][1] - 100) * 0.85f;
            }
        }
    }


    public static void bmi(String[][] students, float[][] weigth) {
        for (int i = 0; i < weigth.length; i++) {
            weigth[i][2] = ((weigth[i][0] - weigth[i][1]) / weigth[i][1]) * 100;
        }
    }

    public static void check(String[][] students, float[][] weigth) {
        for (int i = 0; i < weigth.length; i++) {
            if (weigth[i][2] <= -10.0f) {
                students[i][2] = "저 체중";
            } else if (weigth[i][2] < 20.0f) {
                students[i][2] = "정상 체중";
            } else if (weigth[i][2] <= 29.0f) {
                students[i][2] = "경도 체중";
            } else if (weigth[i][2] <= 49.0f) {
                students[i][2] = "중등도 체중";
            } else {
                students[i][2] = "고도 체중";
            }
        }
    }
}
