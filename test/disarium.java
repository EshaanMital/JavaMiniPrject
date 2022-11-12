import java.util.*;
class disarium
{
    static boolean check(int num)
    {
        int count_digits = Integer.toString(num).length();
        int sum = 0; 
        int x = num;
        while (x!=0)
        { int r = x%10;
          sum = (int) (sum + Math.pow(r, count_digits--));
          x = x/10;
        }
        return (sum == num);
    }
    void three()
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number to be checked");
        num=sc.nextInt();
        System.out.println(check(num) ? "Disarium Number" : "Not a Disarium Number");
    }
}
