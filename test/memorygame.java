import java.util.Scanner;

public class memorygame {
    void four()
    {
        System.out.println("\u000c");
        System.out.println("MEMORY GAME:Lets test how sharp your memory is ");
        Scanner sc = new Scanner(System.in);
        int[] a1=new int[20];
        int[] a2=new int[20];
        int right=0,k=0,l=0;
        double percent=0;
        for(int i=0;i<20;i++)
        {
            a1[i]=1 + (int)(100* Math.random());  
        }
        System.out.println("20 numbers will be displayed on the screen for 20 secs after which user is required to recollect the numbers");
        System.out.println("Press any key to continue");
        char a = sc.next().charAt(0);
        System.out.println("\u000c");

        for(int i=0;i<5;i++)
        {
            System.out.print(a1[i] +"   ");
        }
        System.out.println();
        for(int i=5;i<10;i++)
        {
            System.out.print(a1[i] +"   ");
        }
        System.out.println();
        for(int i=10;i<15;i++)
        {
            System.out.print(a1[i] +"   ");
        }
        System.out.println();
        for(int i=15;i<20;i++)
        {
            System.out.print(a1[i] +"   ");
        }
        System.out.println(); 

        for(double i=0;i<=70000000;i=i+.01)
        {}
        System.out.println("\u000c");
        System.out.println("Pls recollect the 20 numbers shown on the screen");

        
        for(int i=0;i<20;i++)
        {
            a2[i]=sc.nextInt();  
        }
        for(int i=0;i<20;i++)
        {
            for(int j=0;j<20;j++)
            {
                if(a1[i]==a2[j])
                {
                    right=right+1;
                    a1[i]=0;
                    break;
                }
            }
        }
        percent = (float)((right*100)/20);
        System.out.println("You got "+right+ "/20");
        System.out.println("you got "+percent+"% of the numbers right");
    }       
}