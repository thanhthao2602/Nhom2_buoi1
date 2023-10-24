import java.util.Scanner;
public class bai5 {
   public static void main(String[] args ) {
       Scanner s = new Scanner(System.in);
       System.out.print("Nhap 5 so nguyen : ");
       int[] a = new int[5];
       for(int i=0 ; i< 5 ; i++){
           a[i] = s.nextInt();
       }
        int tg;
       for(int i =0 ; i< 5 ; i++)
           for(int j=i+1 ; j<5 ; j++)
               if(a[i]>a[j]){
                  
                 tg = a[i] ;
                 a[i]=a[j];
                 a[j]=tg;
               }
        System.out.println("Hai so lon nhat trong mang la : "+ a[3]+" va "+a[4]);   
       
       
   }
}
