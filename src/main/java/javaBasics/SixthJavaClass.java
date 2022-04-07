package javaBasics;

public class SixthJavaClass {
    public static void main(String[] args) {

        //Switch
        int dayOfTheWeek = 1;

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Saturday");

        }
    }
}
