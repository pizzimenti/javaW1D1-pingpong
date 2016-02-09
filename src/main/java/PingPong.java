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

    public ArrayList pingPongArray(Integer number) {
      ArrayList<Object> pingPongArray = new ArrayList<Object>();
      for (int i = 1; i <= number; i++) {

        if (isPingPong(i)) {
          pingPongArray.add("pingpong");
        } else if (isPong(i)) {
          pingPongArray.add("pong");
        } else if (isPing(i)) {
          pingPongArray.add("ping");
        } else {
          pingPongArray.add(i);
        }
      }
      return pingPongArray;
    }

}

//remove unnecessary comments (like ArrayList import)
