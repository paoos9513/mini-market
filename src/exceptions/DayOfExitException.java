package exceptions;

public class DayOfExitException extends Exception{

    private String numberId2;
    private String dayMonth2;

    public DayOfExitException(String dayPair,String numberId1) {
        super("Today does not correspond to your departure day, for this reason you CANNOT ENTER");
        dayMonth2 = dayPair;
        numberId2 = numberId1;
    }

    public String getNumberId1() {
        return numberId2;
    }

    public String getDayMonth() {
        return dayMonth2;
    }
}
