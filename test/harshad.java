import java.util.*;
public class harshad {
    static boolean checkHarshad(int n)
    {
        int sum = 0;
        for (int temp = n; temp > 0; temp /= 10)
            sum += temp % 10;
        return (n % sum == 0);
    }
    void two()
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number to be checked");
        num=sc.nextInt();
        System.out.println(checkHarshad(num) ? "Yes" : "No");
    }
}