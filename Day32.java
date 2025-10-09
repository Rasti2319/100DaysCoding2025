import java.util.Scanner;

public class LogikaOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hujan (true/false): ");
        boolean hujan = in.nextBoolean();
        System.out.print("Bawa payung (true/false): ");
        boolean payung = in.nextBoolean();

        if (hujan || payung)
            System.out.println("Bisa keluar rumah.");
        else
            System.out.println("Jangan keluar.");
    }
}
