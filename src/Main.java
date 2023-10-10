import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество цветов");
        int color = scanner.nextInt();
        if(color>=1) {
            int N=color+1;
            System.out.println("Минимальное число бусин= "+ N);

        }
    }
}