import java.util.Scanner;

public class PrintNPrimeNumbers {

  public static void main(String[] args) {
    int n;

    boolean isPrime = true;
    int num = 3;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the value: ");

    n = scanner.nextInt();

    if(n >= 1) {
      System.out.println(2);
    }

    for(int i = 2; i <= n; ) {
      for( int j = 2; j <= Math.sqrt(num); j++) {
        if(num%j == 0) {
          isPrime = false;
          break;
        }
      }

      if(isPrime) {
        System.out.println(num);
        i++;
      }
      isPrime = true;
      num++;
    }
  }

}
