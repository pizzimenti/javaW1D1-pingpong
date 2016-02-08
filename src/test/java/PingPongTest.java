import org.junit.*;
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
}
