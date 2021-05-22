import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        int x = sc.nextInt();
        System.out.println("Enter y ");
        int y = sc.nextInt();
        if (x > 0 && y > 0){
            System.out.println("1");
        } else if (x < 0 && y > 0){
            System.out.println("2");
        } else if (x < 0 && y < 0){
            System.out.println("3");
        } else if (x > 0 && y < 0){
            System.out.println("4");
        }

    }
}
