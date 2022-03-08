import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02 {
    public static void main(String[] args) throws IOException {
        float heightAyman,weightAyman;
        double heightpowAyman;
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your Height");
        heightAyman=Float.parseFloat(rd.readLine());
        System.out.println("Please enter your Weight");
        weightAyman=Float.parseFloat(rd.readLine());
        heightpowAyman=Math.pow(heightAyman,2);
        float BMI= weightAyman/ (float)heightpowAyman ;

        if (BMI<=16.00){System.out.println("Your BMI is " + BMI + "And it's Starvation");}
        else if (BMI>16.00 && BMI<=16.99){System.out.println("Your BMI is " + BMI + "And it's emaciation");}
        else if (BMI>17.00 && BMI<=18.49){System.out.println("Your BMI is " + BMI + "And it's underweight");}
        else if (BMI>18.50 && BMI<=22.99){System.out.println("Your BMI is " + BMI + "And it's normal, low range");}
        else if (BMI>23.00 && BMI<=24.99){System.out.println("Your BMI is " + BMI + "And it's normal, high range");}
        else if (BMI>25.00 && BMI<=27.49){System.out.println("Your BMI is " + BMI + "And it's overweight, low range");}
        else if (BMI>27.50 && BMI<=29.99){System.out.println("Your BMI is " + BMI + "And it's overweight, high range");}
        else if (BMI>30 && BMI<=34.9){System.out.println("Your BMI is " + BMI + "And it's – 1st degree obesity");}
        else if (BMI>35 && BMI<=39.9){System.out.println("Your BMI is " + BMI + "And it's – 2nd degree obesity");}
        else if (BMI>=40){System.out.println("Your BMI is " + BMI + "And it's – 3rd degree obesity");};
    }
}


