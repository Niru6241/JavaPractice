public class SwapNumber {

  public static void main(String[] args) {

    int x = 10;
    int y = 5;
    int temp;

    System.out.println("Before swapping: " +x + " , " +y);

    temp = x;
    x = y;
    y = temp;

    System.out.println("After swapping: " +x + " , " +y);
  }
}
