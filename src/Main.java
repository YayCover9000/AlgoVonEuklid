import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int rest=1;
        int y;
        int x;
        int groessereZahl;
        int kleinereZahl;

        Scanner sc = new Scanner(System.in);
        System.out.println("ganze zahl 1");
        x = sc.nextInt();
        System.out.println("ganze zahl 2");
        y = sc.nextInt();
        if(x>y){
            groessereZahl = x;
            kleinereZahl = y;
        }else {
            groessereZahl = y;
            kleinereZahl = x;
        }
        System.out.println(groessereZahl);
        while(rest>0) {
            rest = groessereZahl % kleinereZahl;
            System.out.println(rest);
            groessereZahl = kleinereZahl;
            if(rest==0) {
                System.out.println("ggT ist: " + kleinereZahl);
                return;
            }
            kleinereZahl=rest;
            System.out.println(rest);


        }


    }
}