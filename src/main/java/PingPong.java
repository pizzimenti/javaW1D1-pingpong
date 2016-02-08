//import java.util.ArrayList;
import java.util.*;

public class PingPong {
  public static void main(String[] args) {}

    public Boolean isPingPong(Integer number) {
      //code for testing fifteen even divisibility
      return number % 15 == 0;
    }

    public Boolean isPong(Integer number) {
      //code for testing five even divisibility
      return number % 5 == 0;
    }

    public Boolean isPing(Integer number) {
      //code for testing three even divisibility
      return number % 3 == 0;
    }

    public ArrayList spawnArray(Integer number) {
      //code for returning an ArrayList of integers between 1 and number
      ArrayList<Integer> intArray = new ArrayList<Integer>();
      for (int i = 1; i <= number; i++) {
        intArray.add(i);
      }
      return intArray;
    }
}
