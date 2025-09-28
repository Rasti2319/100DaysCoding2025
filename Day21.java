public class TukarNilaiAritmatika {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Proses tukar nilai tanpa variabel tambahan
        a = a + b;  // a = 5 + 8 = 13
        b = a - b;  // b = 13 - 8 = 5
        a = a - b;  // a = 13 - 5 = 8

        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
