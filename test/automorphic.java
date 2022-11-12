import java.util.*;
class automorphic {
    // Function to check Automorphic number
    static boolean isAutomorphic(int N)
    {
        int sq = N * N;
        while (N > 0) {
          
            if (N % 10 != sq % 10)
                return false;

      
            N /= 10;
            sq /= 10;
        }
        return true;
    }
    void four()
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number to be checked");
        num=sc.nextInt();
        System.out.println(isAutomorphic(num) ? "Automorphic" : "Not Automorphic");
    }
}
