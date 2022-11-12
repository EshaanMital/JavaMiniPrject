import java.util.*;
class specialnos
{
    void seven()
    {
        System.out.println("\u000c");

        Scanner in = new Scanner(System.in);
        emirp obj1=new emirp();
        harshad obj2=new harshad();
        disarium obj3=new disarium();
        automorphic obj4=new automorphic();
        palindrome obj5=new palindrome();
        smith obj6=new smith();
        happy obj7=new happy();
        buzz obj8=new buzz();
        magic obj9=new magic();
        perfect obj10=new perfect();
        System.out.println("Pls select which type of number you want to test");
        System.out.println("1.) Emirp");
        System.out.println("2.) Harshad");
        System.out.println("3.) Disarium");
        System.out.println("4.) Automorphic");
        System.out.println("5.) Palindrome");
        System.out.println("6.) Smith");
        System.out.println("7.) Happy");
        System.out.println("8.) Buzz");
        System.out.println("9.) Magic");
        System.out.println("10.) Perfect");

        int a=in.nextInt();
        switch(a)
        {
            case 1:obj1.one();
                break;
            case 2:obj2.two();
                break;
            case 3:obj3.three();
                break;
            case 4:obj4.four();
                break;
            case 5:obj5.five();
                break;
            case 6:obj6.six();
                break;
            case 7:obj7.seven();
                break;
            case 8:obj8.eight();
                break;
            case 9:obj9.nine();
                break;
            case 10:obj10.ten();
                break;
            default: System.out.println("Error");
        }
    }
}