package exceptions;

public class YoungerException extends Exception{
        private String typeId1;

    public YoungerException(String TI) {
        super("Minors cannot enter");
        typeId1 = TI;
    }

    public String getTypeId1() {
        return typeId1;
    }
}
