package javaapplication28;
public class JavaApplication28 {

    public static void main(String[] args) { 
    //contoh String//
    String teksAngka="20"; 
    String teksDesimal="3.13";
    String teksStatus="true";
    
  //Mengubah String jadi int//  
    int angka =
Integer.parseInt(teksAngka);
 System.out.println("angka=" + teksAngka);
 //Mengubah String jadi double//
     double desimal =
Double.parseDouble(teksDesimal);
 System.out.println("desimal=" + teksDesimal); 
 //Mengubah String jadi boolean//
     boolean status =
Boolean.parseBoolean(teksStatus);
 System.out.println("Status=" + teksStatus);
    }

 }
