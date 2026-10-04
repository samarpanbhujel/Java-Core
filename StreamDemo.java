import java.util.Arrays;
import java.util.List;
// import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11,2,3,4,5,6,7);
        
        // nums.stream().forEach(n -> System.out.println(n));

        // Stream<Integer> s1 = nums.stream();
        // s1.forEach(n -> System.out.println(n));
        /*s1.forEach(n -> System.out.println(n));  /* Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        at java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:311)
        at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:803)
        at StreamDemo.main(StreamDemo.java:13)
        
        Cannot use same Stream twice*/
        
        // Stream<Integer> s2 = nums.stream();
        // Stream<Integer> s3 = s2.filter(n -> n%2==0);
        // Stream<Integer> s4 = s3.map(n -> n*3);
        // int result = s4.reduce(0, (c,e) -> c+e);

        int result = nums.stream().filter(n -> n%2==0).map(n->2).reduce(0,(c,e) -> c+e);

        System.out.println(result);



    }
}
