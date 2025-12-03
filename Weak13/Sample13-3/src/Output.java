public class Output {
    public static void display(int[][] data) {
        display(data);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j]);
            }
            System.out.println();
        }
        display(data);
    }

    public static void display(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println();
    }

    public static void display(int data) {
            System.out.printf("%3s", data);
        }
    }
