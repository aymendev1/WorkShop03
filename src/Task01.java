import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task01 {
    public static void main(String[] args) throws IOException{

        float firstNumberAymen ,SecondNumberAymen,sum,Sub,product,quotient;

        BufferedReader rD = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your first number");
        firstNumberAymen=Float.parseFloat(rD.readLine());
        System.out.println("Please enter your Second number");
        SecondNumberAymen=Float.parseFloat(rD.readLine());
        sum=firstNumberAymen + SecondNumberAymen;
        Sub=firstNumberAymen - SecondNumberAymen;
        product=firstNumberAymen*SecondNumberAymen;
        quotient=firstNumberAymen/SecondNumberAymen;
        System.out.println("The Sum of the numbers is : "+sum);
        System.out.println("The Subtraction of the numbers is : "+Sub);
        System.out.println("The product of the numbers is : "+product);
        System.out.println("The quotient of the numbers is : "+quotient);

    }
}
