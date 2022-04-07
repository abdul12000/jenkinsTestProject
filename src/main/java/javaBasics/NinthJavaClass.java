package javaBasics;

import java.util.ArrayList;

public class NinthJavaClass {
    public static void main(String[] args) {
        //Arrays of strings
        String[] languages = {"English", "French", "Spanish", "Russian", "Yoruba", "Igbo", "Hausa"};
        System.out.println("The size of the array is : " + languages.length);
        System.out.println("The valua of 5th item in the languages array is : " + languages[4]);
        System.out.println("The valua of 3rd item in the languages array is : " + languages[2]);
        //OutOfBoundException
//        System.out.println("The valua of 3rd item in the languages array is : " + languages[7]);

        System.out.println( "-----------------------------------------------------------");
int[] myNum = {5, 10, 15, 20, 25};
        System.out.println(myNum.length);
        System.out.println(myNum[4]);
        //OutOfBoundException
//        System.out.println(myNum[5]);

ArrayList<String> cars = new ArrayList<>();
cars.add("Tesla");
cars.add("BMW");
cars.add("Toyota");
cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Benz");
        cars.add("Nissan");
        cars.add("Jeep");
        cars.add("Lambogini");
        cars.add("Bentley");

        System.out.println("Lenght of Car is :" + cars.size());
        System.out.println(cars.get(2));

//        for(int i = 0; i <cars.size(); i++ ){
//            System.out.println(cars.get(i));
//        }
        for (String car: cars){
            System.out.println(car);
        }

        int[] numbers = {10, 20, 30, 40, 50};
        for(int num: numbers){
            System.out.println(num);
        }

        int[][] myarray = new int[2][2];
        myarray[0][0] = 35;
        myarray[0][1] =  myarray[1][0] =  0;
        myarray[1][1] = 55;
        System.out.println("Array elements are:");
        System.out.println(myarray[0][0] + " " +myarray[0][1]);
        System.out.println(myarray[1][0] + " " +myarray[1][1]);
    }
}
