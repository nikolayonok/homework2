import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год ");
        int a = sc.nextInt();
        if (a % 4 == 0) {
            System.out.println("366");
        } else if (a % 400 != 0) {
            System.out.println("365");
        } else System.out.println("365");
    }
}
