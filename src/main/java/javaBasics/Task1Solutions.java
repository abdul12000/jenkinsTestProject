package javaBasics;

public class Task1Solutions {
    public static void main(String[] args) {
//        for(int i = 1; i < 12; i++){
//            System.out.println("value of i is : " + i);
//        }

//        int n = 11;
//        int even = 2;
//        while (even <= n){
//            System.out.println(even + "");
//            even = even+2;
//        }

//        for (int i = 2; i <= 11; i = i + 2) {
//            System.out.println(i);
//        }

//1, 2,Multiple of three, 4, Multiple of five
//        int a = 100;
//        int b = 3;
//        int c = 5;
//        int d = 15;
//        while (b <= a){
//            System.out.println("Multiple of three :" + b +"");
//            b +=3;
//        }
//        while (c <= a){
//            System.out.println("Multiple of five :" + c +"");
//            c +=5;
//        }
//        while (d <= a){
//            System.out.println("Multiple of three and five :" + d +"");
//            d = d+15;
//        }

//        Write java code to printout 1 to 100. But in the output it should replace the numbers that are multiples
//        of three with "multiple of three" and replace numbers that are multiples of 5 numbers with "multiple of five"
//        and replace numbers that are multiple of both 3 and 5 with "multiple of three and five"


        for(int i = 1; i<=100; i++){

            if(i%3 == 0 && i%5!=0){
                System.out.println("Multiple of three");
            }
            else if(i%5 == 0 && i%3!=0){
                System.out.println("Multiple of five");
            }
            else if (i%15 == 0){
                System.out.println("Multiple of three and five");
            }
            else
                System.out.println(i);

        }
    }

}
