package model;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import exceptions.DayOfExitException;
import exceptions.YoungerException;

public class MiniMarket {
    private int count = 0;
    LocalDate date;
    private List<Client> clients;
    public static final String NAME = "MI BARRIO TE QUIERE";

    public MiniMarket() {
        clients = new ArrayList<>();
    }

    public void addClients(String typeId, String numberId) throws DayOfExitException{

        count += 1 ;
        int dayMonth = LocalDate.now().getDayOfMonth();

        Client infoClient = new Client(typeId,numberId);
        clients.add(infoClient);

        if ((dayMonth%2==0) && (getNumberId()%2!=0)){
            System.out.println(" ");
            System.out.println("YOU CAN ENTER");

        }else if ((dayMonth%2 != 0) && (getNumberId()%2 == 0)){
            System.out.println(" ");
            System.out.println("YOU CAN ENTER");

        }else{
            throw new DayOfExitException(typeId,numberId);
        }


    }

    public int getNumberId(){
        char charId = '0';
        int pairId ;

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

    public List<Client> getClients() {
        return clients;
    }

    public int getCount() {
        return count;
    }
}
