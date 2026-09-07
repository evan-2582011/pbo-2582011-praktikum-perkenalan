import java.util.Scanner;

public class perkenalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        int nim = input.nextInt();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();
        input.nextLine(); // buang sisa enter

        System.out.print("Masukkan asal kota: ");
        String asalKota = input.nextLine();

        System.out.println();
        System.out.println("Halo! Nama saya " + nama + " (NIM " + nim + "), umur "
                + umur + " tahun, tinggi " + tinggi + " cm, berasal dari " + asalKota + ".");


    }
}