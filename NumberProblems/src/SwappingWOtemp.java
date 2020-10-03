public class SwappingWOtemp {

  public static void main(String[] args) {
    int x = 11;
    int y = 5;

    System.out.println("Before swapping: " +x + " , " +y);

    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println("After swapping: " +x + " , " +y);
  }
}
