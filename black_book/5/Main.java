import test.Sample;
import test.SampleFactory;

public class Main {
  public static void main(String[] args) {
    Sample s = SampleFactory.create();
    s.hello();
  }
}
