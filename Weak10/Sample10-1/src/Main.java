import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner keyboard = new Scanner(System.in);
        //int[] java;
        //java = new int[5];

        //int[] java = new int[5];

        int[] java = new int[] {95, 70, 80, 75, 100};
        String[] name = {"홍길동", "이재명", "윤석열", "경복대", "오세훈"};

        int i = 0;
        while (i < name.length) {
            System.out.printf("%s님의 JAVA 성적 입력 : ", name[i]);
            java[i] = keyboard.nextInt();

            if (java[i] >= 0 && java[i] <= 100)
                i++;
            else {
                System.out.printf("ERROR : 0 ~ 100");
                System.in.read();
            }
        }

        for ( i = 0; i < java.length; i++)
            System.out.printf("%d번 JAVA 성적 : %3d 점\n", i + 1, name[i], java[i]);
    }
}