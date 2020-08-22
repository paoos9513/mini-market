package exceptions;

public class YoungerException extends Exception{
        private String typeId1;

    public YoungerException(String TI) {
        super("This person is a minor, for this reason you CANNOT ENTER");
        typeId1 = TI;
    }

    public String getTypeId1() {
        return typeId1;
    }
}
