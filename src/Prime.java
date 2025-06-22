import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean flag = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                break; // No need to check further
            }
        }
        if (flag) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }
    }
}
