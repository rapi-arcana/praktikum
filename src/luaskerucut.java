import java.util.Scanner;

public class luaskerucut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari kerucut: ");
        double radius = input.nextDouble();

        System.out.print("Masukkan garis pelukis kerucut (s): ");
        double slantHeight = input.nextDouble();

        // Menghitung luas permukaan kerucut
        double surfaceArea = Math.PI * radius * (radius + slantHeight);

        System.out.println("Luas permukaan kerucut: " + surfaceArea);

        input.close();
    }
}
