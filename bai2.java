import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        nhap();
    }
    static void nhap(){
        int n , b ;
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap n , b : ");
        n = s.nextInt();
        b = s.nextInt();
        String str = chuyen(n,b);
        System.out.print("So "+n+" chuyen tu he 10 sang he "+b+" co gia tri la : ");
       xuat(str);
        System.out.print("\n");
        
    }
    static void xuat(String str){
        for(int i=0 ; i<str.length();i++){
            System.out.print(str.charAt(str.length()-i-1));
            System.out.print("");
        }
    }
 static String chuyen(int n , int b){
     String str = "";
     int x =0 ;
     while(n>0){
         x = n%b ;
         n = n/b;
         if(b==16){
             if(x==10) str+= "A";
             if(x==11) str+= "B";
             if(x==12) str+= "C";
             if(x==13) str+= "D";
             if(x==14) str+= "E";
             if(x==15) str+= "F";
             if(0<= x && x<10) 
                 str+=x;
             
         }
     }
     return str;
 }
}
