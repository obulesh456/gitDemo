import java.util.Comparator;
import java.util.function.Consumer;

public class ConsumerDemo{
  /*  @Override
    public void accept(Integer integer) {
        System.out.println("PRingting::"+integer);
    }*/

    public static void main(String[] args) {
        Consumer<Integer> cosumer= t ->System.out.println("Printing::"+t);
        cosumer.accept(10);
    }
}
