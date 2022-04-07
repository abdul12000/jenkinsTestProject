package javaBasics;

public class FirstJavaClass {

    public static void main(String[] args) {
//        String word;
//        word = "Testing printout";
        String word = "Testing printout";

        System.out.println("Hello World");
        System.out.println("I am learning Java");
        System.out.println(word);

//int A = 5;
        int A;
        A = 5;
        A =9;
        int B = 10;
        int C = 200;

        System.out.println(A);
        System.out.println(B);

        System.out.println(A + B);
        System.out.println(100 + A);
        System.out.println(50 - 30);
        int D = C/B;
        System.out.println(D);

        int E = C *D;
        System.out.println("Multiplying C and D : " + E);

        int F = C % 11;
        System.out.println( "Value of C modulo 11 : " + F);

    }
}
