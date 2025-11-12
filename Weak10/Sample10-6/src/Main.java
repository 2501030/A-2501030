import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
         String[] hakbun = {"2501002", "2501004", "2501012", "2501022", "2501032",
                  "2510142", "2501054", "2501062", "2501072", "2501082"};
         String[] name = {"홍길동", "이재명", "윤석열", "경복대", "오세훈",
                  "강민성", "김시온", "이진우", "한장우", "니키타"};
         int[] kor = new int[name.length];
         int[] eng = new int[name.length];
         int[] math = new int[name.length];
         int[] sum = new int[name.length];
         float[] avg = new float[name.length];
         int[] rank = new int[name.length];
         boolean swapped = false;

         int i = 0;
         while (i < kor.length) {
             System.out.printf("%s님의 국어 성적 입력 : ", name[i]);
             kor[i] = keyboard.nextInt();
             System.out.printf("%s님의 영어 성적 입력 : ", name[i]);
             eng[i] = keyboard.nextInt();
             System.out.printf("%s님의 수학 성적 입력 : ", name[i]);
             math[i] = keyboard.nextInt();

             if (kor[i] >= 0 && kor[i] <= 100) {
                 i++;
                 System.out.println();
             } else {
                 System.err.println("ERROR : 0 ~ 100");
                 System.in.read();
             }
             System.out.println();
         }
         System.out.println("************************************");
         System.out.println(" 학번 이름 국어 영어 수학 총점 평균 등수");
         System.out.println("************************************");
    }
}