import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("количество банок простреленых Гарри: ");
        int BG = scanner.nextInt();
        System.out.println("количество банок простреленых Ларри: ");
        int BL = scanner.nextInt();

        int BS=BG+BL;
        int G1=BS-BG-1;
        int L1=BS-BL-1;
            System.out.println("Гарри не прострелил "+G1+" банок, Ларри "+L1+" банок.");

    }
}