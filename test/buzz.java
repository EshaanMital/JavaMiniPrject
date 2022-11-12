import java.util.*;   
import java.io.*;   
import java.util.Scanner;  
class buzz {   
    static boolean checkNumber(int number)   
    {   
        if(number % 10 == 7 || number % 7 == 0)  
            return true;      
        else  
            return false;     
    }   
    void eight()   
    {     
        int n1, n2;  
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter first number");  
        n1 = sc.nextInt();  
        if (checkNumber(n1))   
            System.out.println(n1 + " is a Buzz number");   
        else  
            System.out.println(n1 + " is not a Buzz number");   
    }   
}