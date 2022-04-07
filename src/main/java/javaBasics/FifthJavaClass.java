package javaBasics;

public class FifthJavaClass {

    private String GetDayOfTheWeekForMe(int dayOfTheWeek) {
//if else condition
        if (dayOfTheWeek == 1) {
            return ("Sunday");
        } else if (dayOfTheWeek == 2) {
            return ("Monday");
        } else if (dayOfTheWeek == 3) {
            return ("Tuesday");
        } else if (dayOfTheWeek == 4) {
            return ("Wednesday");
        } else if (dayOfTheWeek == 5) {
            return ("Thursday");
        } else if (dayOfTheWeek == 6) {
            return ("Friday");
        } else
            return ("Saturday");
    }

    public static void main(String[] args) {
        FifthJavaClass fifthJavaClass = new FifthJavaClass();
        fifthJavaClass.GetDayOfTheWeekForMe(4);
    }
}
