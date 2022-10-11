public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main object = new Main();
    object.x = 25;                    // will generate an error: cannot assign a value to a final variable
    System.out.println(object.x);
  }
}
