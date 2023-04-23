import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r;
        double pi,alan,cevre;
        pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz :");
        r = input.nextInt();
        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("Dairenin alanı :"+alan);
        System.out.println("Dairenin çevresi : " +cevre);
    }
}