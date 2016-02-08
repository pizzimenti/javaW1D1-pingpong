import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void isPingPong_forNumberDivisibleByFifteen_true() {
    PingPong testPingPong = new PingPong();
    assertEquals(true, testPingPong.isPingPong(30));
  }

  @Test
  public void isPong_forNumberDivisibleByFive_true() {
    PingPong testPingPong = new PingPong();
    assertEquals(true, testPingPong.isPong(10));
  }

  @Test
  public void isPing_forNumberDivisibleByThree_true() {
    PingPong testPingPong = new PingPong();
    assertEquals(true, testPingPong.isPing(6));
  }

  @Test
  public void copiesArrayWithStrings_thatMatchPingPongTests_pingPongArray() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add(1);
    myList.add(2);
    myList.add("ping");
    myList.add(4);
    myList.add("pong");
    myList.add("ping");
    myList.add(7);
    myList.add(8);
    myList.add("ping");
    myList.add("pong");
    myList.add(11);
    myList.add("ping");
    myList.add(13);
    myList.add(14);
    myList.add("pingpong");
    assertEquals(myList, testPingPong.pingPongArray(15));
  }
}
