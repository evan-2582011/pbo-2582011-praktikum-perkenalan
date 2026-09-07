import java.util.Scanner;

public class perkenalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama\t\t: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM\t\t: ");
        int nim = input.nextInt();

        System.out.print("Masukkan umur\t\t: ");
        int umur = input.nextInt();
        input.nextLine(); // buang sisa enter

        System.out.print("Masukkan tinggi\t\t: ");
        double tinggi = input.nextDouble();
        input.nextLine(); // buang sisa enter

        System.out.print("Masukkan asal kota\t: ");
        String asalKota = input.nextLine();

        System.out.println();
        System.out.println("Halo! Nama saya " + nama + " (NIM " + nim + "), umur "
                + umur + " tahun, tinggi " + tinggi + " cm, berasal dari " + asalKota + ".");
    }
}