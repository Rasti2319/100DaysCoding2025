	import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        if (umur >= 17){
            System.out.println("cie sudah dewasa.");
        }
        else{

        System.out.println("masih bocil");
        }
    }
}
	
