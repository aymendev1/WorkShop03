import java.io.IOException;
import java.util.Random;
public class Task05 {
    public static void main(String[] args) throws IOException {
int collection= 10,i=1;
int num , min=101,max=0;
        System.out.println("Let's find the smallest and greatest of the collection no " +collection );
        Random r = new Random();
        while(i<=collection){
            num=Math.round(r.nextInt(100)+1);
            System.out.print(num +",");
            if(num<min) min=num;
            if(num>max) max=num;
            i++;
        }
        System.out.println("The Largest num is "+max);
        System.out.println("The Smallest num is "+min);

    }
}
