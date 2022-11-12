import java.util.*;
class palindrome{  
    void five(){  
        int r,sum=0,temp;    
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number to be checked");
        num=sc.nextInt();
        temp=num;    
        while(num>0){    
            r=num%10;  //getting remainder  
            sum=(sum*10)+r;    
            num=num/10;    
        }    
        if(temp==sum)    
            System.out.println("palindrome number ");    
        else    
            System.out.println("not palindrome");    
    }  
}