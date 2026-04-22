
import java.util.Scanner;

public class Amstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0, rem, temp;

        temp = num;

        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }

        if (sum == temp) {
            System.out.println("Armstrong"); 
        }else {
            System.out.println("Not Armstrong");
        }
    }
}
