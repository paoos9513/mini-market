package model;

import java.time.LocalDate;
import java.util.ArrayList;
import exceptions.DayOfExitException;
import exceptions.YoungerException;

public class MiniMarket {
    private int count = 0;
    LocalDate date;
    private ArrayList<Client> clients;
    private ArrayList<Client> clientsIn;

    public static final String NAME = "MI BARRIO TE QUIERE";

    public MiniMarket() {
        clients = new ArrayList<>();
    }

    public void addClients(String typeId, String numberId) throws DayOfExitException,YoungerException{


        count += 1 ;
        int dayMonth = LocalDate.now().getDayOfMonth();
        Client allInfoClient = new Client(typeId,numberId);
        clients.add(allInfoClient);
        Client infoClient = new Client(typeId,numberId);
        if (allInfoClient.getTypeId().equalsIgnoreCase("TI")){

            throw new YoungerException(typeId);

        }else if ((dayMonth%2==0) && (getNumberId()%2!=0)){

            System.out.println(" ");
            System.out.println("YOU CAN ENTER");
            clientsIn.add(infoClient);
            System.out.println("IT HAS BEEN REGISTERED CORRECTLY");

        }else if ((dayMonth%2 != 0) && (getNumberId()%2 == 0)){
            System.out.println(" ");
            System.out.println("YOU CAN ENTER");
            clientsIn.add(infoClient);
            System.out.println("IT HAS BEEN REGISTERED CORRECTLY");
        }else{
            throw new DayOfExitException(typeId,numberId);
        }
    }

    public int getNumberId(){
        char charId = '0';
        int pairId ;

        for (Client client : clients) {
            charId = client.getNumberId().charAt(client.getNumberId().length() - 2);
        }
        pairId = Character.getNumericValue(charId);
        return pairId;
    }

    public static String getNAME() {
        return NAME;
    }

    public int getCount() {
        return count;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public ArrayList<Client> getClientsIn() {
        return clientsIn;
    }

}
