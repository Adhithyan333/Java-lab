import java.io.*;
public class Lab7{
    public static void main(String args[]){
        int n=15;
        System.out.print(n1+" "+n2); 
        p(n-2);
        
    }
    
    static int n1=0,n2=1,n3=0;  
  static void p(int n){    
      if(n>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         p(n-1);    
     }
  }
}