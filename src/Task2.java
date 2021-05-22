import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время ");
        int a = sc.nextInt();
        if (a >= 1 && a <= 8){
            System.out.println("Good Morning");
        } else if (a >=9 && a <= 17){
            System.out.println("Good Day");
        } else if (a >=18 && a <= 21){
            System.out.println("Good evening");
        } else if (a >=22 && a <= 24){
            System.out.println("Good Night");
        } else System.out.println("Mistake");
    }
}
