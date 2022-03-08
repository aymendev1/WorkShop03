import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Task03 {
    public static void main(String[] args) throws IOException {
        //Let's write a program that solve the quadratic equation ax2+bx+c=0;
        float a,b,c,x1,x2;
        int root=0;
        BufferedReader rD = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Let's solve the quadratic equation ax2+bx+c=0;");
        System.out.println("Please enter A");
        a=Float.parseFloat(rD.readLine());
        System.out.println("Please enter B");
        b=Float.parseFloat(rD.readLine());
        System.out.println("Please enter C");
         c=Float.parseFloat(rD.readLine());
         if (a==0){System.out.println("Please enter another number , bigger or less than zero");}
         float delta=(b*b)-(4*a*c);
         if (delta<0){root=0;}
         else if(delta==0){root=1;}
         else if(delta>0){root=2;}
         switch (root){
             case 0:
                 System.out.println("There is no solution for this Equation in R");
                  break ;
             case 1: x1=(-b)/(2*a);
                 System.out.println("There is one solution for this Equation :  X = "+x1);
                 break;
             case 2 : x1= (float) ((-b)+Math.sqrt(delta))/(2*a);
                 x2= (float) ((-b)-Math.sqrt(delta))/(2*a);
                 System.out.println("There is two solution for this Equation :  ");
                 System.out.println("X1 = "+x1);
                 System.out.println("X2 = "+x2);
             default:
                 break;

         }


}}
