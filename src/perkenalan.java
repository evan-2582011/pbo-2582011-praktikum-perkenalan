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


    }
}