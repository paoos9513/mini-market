package model;

public class Client {
    private  String typeId;
    private  String numberId;
    public static final String CITIZENSHIP_CARD = "CC";
    public static final String FOREIGN_CERTIFICATE = "CE";
    public static final String IDENTITY_CARD = "TI";
    public static final String PASSPORT = "PP";

    public Client(String typeId, String numberId) {
        this.typeId = typeId;
        this.numberId = numberId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public String getTypeId() {
        return typeId;
    }

    public String getNumberId() {

        return numberId;
    }

    public static String getCitizenshipCard() {
        return CITIZENSHIP_CARD;
    }

    public static String getForeignCertificate() {
        return FOREIGN_CERTIFICATE;
    }

    public static String getIdentityCard() {
        return IDENTITY_CARD;
    }

    public static String getPASSPORT() {
        return PASSPORT;
    }


}
