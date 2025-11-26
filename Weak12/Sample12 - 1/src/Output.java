public class Output {
    public static void display(int first, int second, int result) {
        display();
        System.out.printf("%d + %d = %d\n", first, second, result);
        display();
    }
    private static void display() {
        System.out.println("**********************");
    }
}
