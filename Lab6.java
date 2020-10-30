import java.io.*;
public class Lab6{
    public static void main(String args[]){
    int n=68,i;
    System.out.println("Factors of "+n+" are");
       for(i=1;i<=n;i++){
       if (n%i==0)
       System.out.println(+i);
          }
     }
}