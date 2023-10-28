package tipedata;
import java.util.Scanner;
public class latihan25_ejaannama {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
     System.out.print("Masukan nama depan anda : ");
        String nama1 = scanner.nextLine();
        System.out.println("Ejaan untuk \"" + nama1 + "\" adalah :");
        for (int i = 0; i < nama1.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama1.charAt(i));
        }
    }
}
