package javaBasics;

public class SecondJavaClass {
    private Integer addingMethod(int a, int b) {
        return (a + b);
    }

    public int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public int max2(int x, int y) {
        if (x > y) {
            return x;
        } else if (x == y) {
            return x;
        } else
            return y;

    }



    public static void main(String[] args) {
        //Creating an Object:
        SecondJavaClass secondJavaClass = new SecondJavaClass();

        System.out.println(secondJavaClass.addingMethod(100, 200));

        System.out.println(secondJavaClass.max(20, 20));
        System.out.println(secondJavaClass.max2(30, 100));

    }
}
