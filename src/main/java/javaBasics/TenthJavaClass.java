package javaBasics;

public class TenthJavaClass {

    enum PhoneType{
        SAMSUNG,
        IPHONE,
        HTC,
        NOKIA,
        MOTOROLA;
    }

    public static void main(String[] args) {
        System.out.println(PhoneType.IPHONE);
        System.out.println(PhoneType.NOKIA);

        System.out.println(CarTypes.TESLA);
    }

}
