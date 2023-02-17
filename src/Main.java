import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /*var abc = new Drobi(0, 5);
        var ecd = new Drobi(2, 4);
        var resultSum = abc.Sum(ecd);
        var resultVych = abc.Vychitanie(ecd);
        var resultUmnozh = abc.Umnozhenie(ecd);
        var resultDel = abc.Delenie(ecd);
        System.out.println("Summa" + resultSum);
        System.out.println("Vychitanie" + resultVych);
        System.out.println("Umnozhenie" + resultUmnozh);
        System.out.println("Delenie" + resultDel);
    }
}*/
        Scanner in = new Scanner(System.in);
        System.out.println("Input chislitel1: ");
        int chislitel1 = in.nextInt();
        System.out.println("Input znamenatel1: ");
        int znamenatel1 = in.nextInt();
        System.out.println("Input chislitel2: ");
        int chislitel2 = in.nextInt();
        System.out.println("Input znamenatel1: ");
        int znamenatel2 = in.nextInt();
        var abc = new Drobi(chislitel1, znamenatel1);
        var ecd = new Drobi(chislitel2, znamenatel2);
        var resultSum = abc.Sum(ecd);
        var resultVych = abc.Vychitanie(ecd);
        var resultUmnozh = abc.Umnozhenie(ecd);
        var resultDel = abc.Delenie(ecd);
        System.out.println("Summa" + resultSum);
        System.out.println("Vychitanie" + resultVych);
        System.out.println("Umnozhenie" + resultUmnozh);
        System.out.println("Delenie" + resultDel);
        in.close();
    }
}

