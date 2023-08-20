import java.util.Scanner;

//Найти произведение всех целых чисел от a до b (значения a и b вводятся
//с клавиатуры; b >= a).
public class Main {
    public static void main(String[] args) {
        int res = 1;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число");
            int a = scanner.nextInt();
            System.out.println("Введите второе число, оно должно быть больше или равно первому!");
            int b = scanner.nextInt();
            if (a <= b) {
                for (int i = a; i <= b; i++) {
                    res = i * res;
                }
                System.out.println(res);
            } else {
                System.out.println("Ты что-то неправильно ввел, попробуй заново");
            }
        } catch (Exception e) {
            System.out.println("Ты что-то неправильно ввел, попробуй заново");
        }
    }
}