import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt(); // 4
        int y1 = sc.nextInt(); // 3
        int x2 = sc.nextInt(); // 7
        int y2 = sc.nextInt(); // 3

        if ((x1 == x2 && y1 != y2) || (y1 == y2 && x1 != x2))
            System.out.println("YES");
        else {
            System.out.println("NO");
        }
    }
}