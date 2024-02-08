import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CompletableFeatureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(10);
        Future<List<Integer>> future = service.submit(() -> {
            delay(1);
            return Arrays.asList(1, 2, 3, 4);
        });
        List<Integer> integers = future.get();
        System.out.println(integers);
        System.out.println("added for git..");
    }
    private static void delay(int i){
        try{
            TimeUnit.MINUTES.sleep(i);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
