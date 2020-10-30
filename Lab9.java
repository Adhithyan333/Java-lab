import java.io.*;
public class Lab9{
    public static void main(String args[]){
    int n1=12344321;
	P(n1);
	}
	 static void P(int n){
		int temp=n,sum=0,r;    
		 while(n>0){    
			 r=n%10;  
			 sum=(sum*10)+r;    
			 n=n/10;			
		 }    
		 if(temp==sum)    
			 System.out.println(temp+" is a palindrome number");    
		 else    
			 System.out.println(temp+" is not a palindrome number");
    }
}
        