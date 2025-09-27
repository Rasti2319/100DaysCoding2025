public class Main {
	public static void main(String[] args) {
          //data primitif
              int angka = 100;

       // 1. Menggunakan tanda kutip kosong ("")
        String str1 = angka + "";
        
        // 2. Menggunakan String.valueOf()
        String str2 = String.valueOf(angka);
        
        // 3. Menggunakan Integer.toString()
        String str3 = Integer.toString(angka);

        // Output hasil konversi
        System.out.println("Cara 1: " + str1);
        System.out.println("Cara 2: " + str2);
        System.out.println("Cara 3: " + str3);
    }
}
   
