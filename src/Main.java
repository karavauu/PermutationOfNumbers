import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (a + b == c) {
            System.out.println("YES");
        } else if (a + c == b) {
            System.out.println("YES");
        } else if (b + c == a) {
            System.out.println("YES");
        } else if (b + a == c) {
            System.out.println("YES");
        } else if (c + b == a) {
            System.out.println("YES");
        } else if (c + a == b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}