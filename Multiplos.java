
package multiplos;
import java.util.*;
public class Multiplos {

   
    public static void main(String[] args) {
       Scanner lec= new Scanner (System.in);
       
       int n,sum3=0,sum5=0,c=1;
       
       System.out.println("introduce un numero");
       n=lec.nextInt();
       
       while(c<=n){
         if(c%3==0){
            System.out.println("multiplo de 3 = "+c);
            sum3=sum3+c;
                  }
         if(c%5==0){
            System.out.println("multiplo de 5 = "+c);
            sum5=sum5+c;
                   }
         
              c++; 
                  }
            System.out.println("la suma de los multiplos de 3 es : "+sum3);
            System.out.println("la suma de los multiplos de 5 es : "+sum5);
    }
 }
