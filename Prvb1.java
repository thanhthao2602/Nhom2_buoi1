
package prvb1;
import java.util.Scanner;

public class Prvb1 {
     public static int gcd(int a , int b){
         if(b==0){
             return a;
         }
         return gcd(b , a%b);
     }
     public static int lcm(int a , int b){
         return a*b / gcd(a,b);
     }
   
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        
         System.out.println("Nhap 3 so : ");
         int a = s.nextInt();
         int b = s.nextInt();
         int c= s.nextInt();
          int kq = gcd(a,b)   ;
          kq= gcd(kq , c);
          int Kq = lcm(a,b);
          Kq = lcm(Kq , c);
          System.out.printf("Uoc chung lon nhat cua 3 so la : " + kq +"\n");
          System.out.printf("Boi chung nho nhat cua 3 so la : "+Kq + "\n");
          
              
         
    }
    
}
