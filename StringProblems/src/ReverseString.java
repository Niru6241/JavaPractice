public class ReverseString {

  public static void main(String[] args) {

    String a = "niranjan";

    char[] charArray = a.toCharArray();

    for(int i = a.length() - 1; i >= 0; i--) {

      System.out.print(charArray[i]);
    }

  }
}
