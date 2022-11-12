import java.util.*;
class central
{
    void main()
    {
        Scanner in = new Scanner(System.in);
        tictactoe obj1=new tictactoe();
        hangman obj2=new hangman();
        guessn obj3=new guessn();
        memorygame obj4=new memorygame();
        rps obj5=new rps();
        hand obj6=new hand();
        specialnos obj7=new specialnos();
        battleship obj8=new battleship();
        System.out.println("");
        System.out.println("|---------------------------------------|");
        System.out.println(" (*) 🅰🅽🅳🆁🅾🅸🅳 🅶🅰🅼🅴 🆂🆃🆄🅳🅸🅾 (*)");
        System.out.println("|_______________________________________|");
        System.out.println("");
        System.out.println("");
        System.out.println("Wҽʅƈσɱҽ ƚσ ƚԋҽ αɾҽɳα");
        System.out.println("Wԋιƈԋ ɠαɱҽ ɖօ ყσυ ɯαɳƚ ƚσ ρʅαყ ƚσԃαყ");
        System.out.println("");

        System.out.println("1.) ƬƖƇ ƬƛƇ ƬƠЄ");
        System.out.println("2.) ӇƛƝƓMƛƝ");
        System.out.println("3.) ƓƲЄƧƧ ƬӇЄ ƝƲMƁЄƦ");
        System.out.println("4.) MЄMƠƦƳ ƬЄҲƬ");
        System.out.println("5.) ƦƠƇƘ ƤƛƤЄƦ ƧƇƖƧƧƠƦƧ");
        System.out.println("6.) ӇƛƝƊ ƇƦƖƇƘЄƬ");
        System.out.println("7.) ƧƤЄƇƖƛԼ ƝƲMƁЄƦƧ");
        System.out.println("8.) ƁƛƬƬԼЄƧӇƖƤ");

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
            case 8: obj8.eight();
                break;
            default: System.out.println("Error");
        }
    }
}