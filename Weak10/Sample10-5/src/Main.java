import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        float[] movie = new float[10];
        final float MIN = 1.0f;
        final float MAX = 10.0f;
        final float MID = 5.0f;
        float total = 0.0f, avg;
        int maxCoount = 0;
        int minCoount = 0;

        int i = 0;
        while (i < movie.length) {
            System.out.printf("%d번 고객의 평점 입력 : ", i + 1);
            movie[1] = keyboard.nextFloat();

            if (movie[i] >= MIN && movie[i] <= MAX)
                i++;
            else {
                System.out.printf("ERROR : %.1f ~ %.1f", MIN, MAX);
                System.in.read();
            }
        }
        for (i = 0; i < movie.length; i++)
            total += movie[i];
        avg = total / movie.length;

        for (i = 0; i < movie.length; i++){
            if (movie[i] == MAX)
                maxCoount++;
            if (movie[i] == MID)
                minCoount++;
        }
        System.out.printf("평균 점수 : %3.1f 점\n", avg);
        System.out.printf("만점자(%.0f 점) 수 : %d 명\n", MAX, maxCoount);
        System.out.printf("%.0f점 이하자 수 : %d 명\n", MID, minCoount);
    }
}