import java.util.Scanner;

public class prime_100 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào giá trị lơn nhat của số nguyên tố");
        int input= scanner.nextInt();
        int number=0;
        while (number<input) {
            boolean isPrime = true;
            if (number < 2) {
                isPrime = false;
            } else if (number == 2) {
                isPrime = true;
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                    System.out.println(number);
            }
            number++;
        }

    }
}
