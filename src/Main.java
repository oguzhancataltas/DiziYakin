import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int[] temp = arr.clone();
        Arrays.sort(temp);

        System.out.print("Bir sayı giriniz : ");
        int number = scan.nextInt();

        for (int i = 0; i < temp.length; i++) {
            if (temp[i]> number){
                System.out.println("Girilen sayıdan küçük en yakın sayı : " + temp[i-1]);
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + temp[i]);
                break;
            }
        }


    }
}
