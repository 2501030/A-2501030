import java.io.PrintStream;

public class Main {
    static void main(String[] args) {
        String[] products = {"TV", "냉장고"};
        int[][] sales = new int[products.length][];
        int[][] sales[0] = {{2018, 9, 7, 4, 3, 2}, {2019, 5, 6, 7, 8, 7}, {2020, 13, 21, 7, 6, 4}};
        int[][] sales[1] = {{2018, 8, 9, 4, 3, 2}, {2019, 5, 6, 7, 8, 7}, {2020, 13, 21, 7, 6, 4}};

        System.out.println("**************************************************");
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%4s, %4d년, %4s %4d %4d %4d %4d\n", products[i], sales[i][j],
                        sales[i][0], sales[i][1], sales[i][2], sales[i][3],
                        sales[i][4], sales[i][5]);
            }
        }
        System.out.println("**************************************************");
    }
}