package Exceptions;

public class DayOfExitException extends Exception{

    private String numberId1;
    private String dayMonth;

    public DayOfExitException(String dayPair, String idOdd) {
        super("today is not your departure day,, cannot enter");
        numberId1 = idOdd;
        dayMonth = dayPair;
    }

    public String getNumberId1() {
        return numberId1;
    }

    public String getDayMonth() {
        return dayMonth;
    }
}
