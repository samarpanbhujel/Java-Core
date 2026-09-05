import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println("enter the String");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
        br.close();
    }
}