import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите животное: 1 - кошка, 2 - собака, 3 - корова, 4 - свинья, 5 - петух," +
                " 6 - волк, 7 - мышь, 8 - ворона, 9 - овца, 10 - змея");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Мяу");
                break;
            case 2:
                System.out.println("Гаф");
                break;
            case 3:
                System.out.println("Муу");
                break;
            case 4:
                System.out.println("Хрю");
                break;
            case 5:
                System.out.println("Кукареку");
                break;
            case 6:
                System.out.println("Ауф");
                break;
            case 7:
                System.out.println("Пипипи");
                break;
            case 8:
                System.out.println("Кар");
                break;
            case 9:
                System.out.println("Меее");
                break;
            case 10:
                System.out.println("Шшшш");
                break;
        }

    }
}
