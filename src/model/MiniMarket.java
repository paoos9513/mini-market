package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class MiniMarket {
    LocalDate date;
    private ArrayList<Client> clients ;
    public static final String NAME = "MI BARRIO TE QUIERE";

    public MiniMarket() {
        clients = new ArrayList<Client>();
    }

    public void addClients(String typeId, String numberId){


    }
    public void dayMonth(LocalDate date) {
        this.date = date;
    }
    public void setClients(ArrayList clients) {
        this.clients = clients;
    }

    public static String getNAME() {
        return NAME;
    }

    public ArrayList getClients() {
        return clients;
    }
}
