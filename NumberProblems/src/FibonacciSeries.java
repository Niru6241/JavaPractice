import java.util.Scanner;

public class FibonacciSeries {

  public static void main(String[] args) {

    //number of elements to be printed
    Scanner scanner = new Scanner(System.in);
    System.out.println("Print the number of elements to be printed");
    int numberOfElements= scanner.nextInt();
    scanner.close();

    int sum=0;

    // first two number of series
    int prev=0,next=1;

    //printing first two elements
    System.out.print(prev+" "+next);

    for(int i=2;i<numberOfElements;i++) {
      sum=prev+next;
      System.out.print(" "+sum);
      prev=next;
      next=sum;
    }
  }
}
