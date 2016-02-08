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
  public void spawnsArray_forNumbersFromZeroToNumber_intArray() {
    PingPong testPingPong = new PingPong();

    ArrayList<Integer> myList = new ArrayList<Integer>();
    myList.add(1);
    myList.add(2);
    assertEquals(myList, testPingPong.spawnArray(2));
  }
}
