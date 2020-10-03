import java.util.HashMap;

public class CountWordsHashMap {

  public static void main(String[] args) {
    String str ="This is done by me";
    String[] split = str.split(" ");

    HashMap<String, Integer> mapCount = new HashMap<>();

    for(int i = 0; i < split.length; i++) {
      if(mapCount.containsKey(split[i])) {
        int count = mapCount.get(split[i]);
        mapCount.put(split[i], count+1);
      } else {
        mapCount.put(split[i], 1);
      }
    }
    System.out.println(mapCount);
  }
}
