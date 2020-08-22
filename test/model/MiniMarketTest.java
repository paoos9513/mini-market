package model;

import exceptions.DayOfExitException;
import exceptions.YoungerException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class MiniMarketTest {
    private MiniMarket miniMarket ;

    private void setupScenary1(){
        miniMarket = new MiniMarket();
    }
    @Test
    public void testAddClient_1(){
        setupScenary1();
        String typeId = "CC";
        String numberId = "11441840232";
        try{
            miniMarket.addClients(typeId,numberId);
            assertEquals(1, miniMarket.getClients().size());
            assertEquals(1, miniMarket.getClients().get(0).getTypeId());
            System.out.println("cliente agregado");
        }catch (YoungerException motive1){

            fail("YoungerException NO SE ESPERA QUE SEA menor de edad");

        }catch (DayOfExitException motive){
            fail("DayOfExitException NO SE ESPERA no le toca mijo");

        }

    }
    @Test
    public void testAddClient_2(){
        setupScenary1();
        String typeId = "TI";
        String numberId = "11441840232";

        try{
            miniMarket.addClients(typeId,numberId);
            assertEquals(1, miniMarket.getClients().size());
            assertEquals(1, miniMarket.getClients().get(0).getTypeId());
            assertEquals(1, miniMarket.getClients().get(0).getNumberId());

        }catch (YoungerException motive1){

            System.out.println(" " + motive1);

        }catch (DayOfExitException motive){
            fail("DayOfExitException NO SE ESPERA no le toca mijo");

        }

    }

    @Test
    public void testAddClient_3(){
        setupScenary1();
        int dayMonth = LocalDate.now().getDayOfMonth();
        String typeId = "CC";
        String numberId = "11441840232";

        if (((dayMonth % 2 == 0) && (miniMarket.getNumberId() % 2== 0))|| ((dayMonth%2!= 0) && (miniMarket.getNumberId()%2!=0))){
            System.out.println(" ");
            System.out.println("YOU CAN ENTER");

            try{
                miniMarket.addClients(typeId,numberId);
                assertEquals(1, miniMarket.getClients().size());
                assertEquals(1, miniMarket.getClients().get(0).getNumberId());
                assertEquals(1,dayMonth, miniMarket.getClients().get(0).getNumberId());

            }catch (YoungerException motive1){
            fail("YoungerException no se espera");

            }catch (DayOfExitException motive){
            System.out.println("DayOfExitException SE ESPERA " + motive);

            }

        }else{
            System.out.println("no hay exceotion");
        }
    }

    @org.junit.jupiter.api.Test
    void addClients() {
    }

    @org.junit.jupiter.api.Test
    void getNumberId() {
    }

    @org.junit.jupiter.api.Test
    void getNAME() {
    }

    @org.junit.jupiter.api.Test
    void getCount() {
    }
}