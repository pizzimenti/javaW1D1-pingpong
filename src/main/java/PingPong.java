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
}
