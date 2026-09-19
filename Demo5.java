import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

public class Demo5 {
    public static void main (String [] args) {
        List<Integer> num = Arrays.asList(4,5,6,7,8,9);
        // Consumer<Integer> con = n -> System.out.println(n);
        num.forEach(n -> System.out.println(n));
    }
}