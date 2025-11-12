import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text;
        char[] convert;

        System.out.print("영 문장 입력 : ");
        text = keyboard.nextLine();

        convert = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(1) >= 'a' && text.charAt(1) <= 'z' ) {
                convert[i] = (char) (text.charAt(1) - 32);
            } else if (text.charAt(1) >= 'A' && text.charAt(1) <= 'Z') {
                convert[i] = (char) (text.charAt(1) + 32);
            } else {
                convert[i] = text.charAt(1);
            }
        }
        System.out.printf("원문 : %s\n", text);
        System.out.printf("변환 : %s\n", new String[convert[0]]);
    }
}