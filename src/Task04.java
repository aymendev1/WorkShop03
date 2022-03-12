import java.io.IOException;

public class Task04 {
    public static void main(String[] args) throws IOException {
        System.out.println("Even numbers from 1 to 100 are :");
        int result=0;
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                result +=i;

            }
        }
        System.out.println(result);
    }
}
