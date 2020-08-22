package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class MiniMarket {
    LocalDate date;
    private ArrayList<Client> clients ;
    public static final String NAME = "MI BARRIO TE QUIERE";

    public MiniMarket() {
        clients = new ArrayList<>();
    }

    public void addClients(String typeId, String numberId){
        int dayMonth = LocalDate.now().getDayOfMonth();
       Client infoClient = new Client(typeId,numberId);
       clients.add(infoClient);
        if((dayMonth/2==0) && (getNumberId()/2==0)){

        }
    }

    public int getNumberId(){
        char charId = '0';
        int pairId = 0;

        for(int i = 0; i<clients.size(); i++){
           charId = clients.get(i).getNumberId().charAt(clients.get(i).getNumberId().length()-2);
        }
        pairId = Character.getNumericValue(charId);
        return pairId;

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
