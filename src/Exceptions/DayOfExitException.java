package Exceptions;

public class DayOfExitException extends Exception{

    private String numberId;
    private String dayMonth;

    public DayOfExitException(String dayPair, String idOdd) {
        super("today is not your departure day,, cannot enter");
        numberId = idOdd;
        dayMonth = dayPair;
    }

    public String getNumberId() {
        return numberId;
    }

    public String getDayMonth() {
        return dayMonth;
    }
}
