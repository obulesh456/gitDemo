import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner stringJoiner=new StringJoiner("; ");
        stringJoiner.add("obulesh");
        stringJoiner.add("obulesh1");
        stringJoiner.add("obulesh2");
        System.out.println(stringJoiner);
    }
}
