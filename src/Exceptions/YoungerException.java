package Exceptions;

public class YoungerException extends Exception{
        private String typeId;

    public YoungerException(String TI) {
        super("Minors cannot enter");
        typeId = TI;
    }

    public String getTypeId() {
        return typeId;
    }
}
