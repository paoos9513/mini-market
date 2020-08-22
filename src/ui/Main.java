package ui;


import model.MiniMarket;
import java.time.LocalDate;
import java.util.Scanner;
import exceptions.DayOfExitException;
import exceptions.YoungerException;

public class Main {
    Scanner scan = new Scanner(System.in);
    MiniMarket miniMarket = new MiniMarket();
    int opt;

    public Main(){
        menu();
    }

    public static void main(String[] args){
        new Main();
    }

    public void menu(){
        System.out.println(" ");
        System.out.println("***************** " + MiniMarket.getNAME() + " *****************");
        System.out.println("-----------------MENU-----------------");
        System.out.println("------ENTER THE OPTION YOU WANT TO MAKE------");
        System.out.println("(1). REGISTER A PERSON");
        System.out.println("(2). CONSULT NUMBER OF PEOPLE WHO CAME");
        System.out.println("(3) EXIT THE PROGRAM");
        opt = Integer.parseInt(scan.nextLine());

        switch (opt){

            case 1:
                optionMenuOne();
                break;
            case 2:
                count();
                break;
            case 3:
                scan.close();
                break;
            default:
                System.out.println("The option is incorrect");
        }
    }

    public void optionMenuOne() {

        System.out.println("------ENTER THE TYPE OF DOCUMENT------");
        System.out.println(" ");
        System.out.println("(CC). CITIZENSHIP CARD  \n" +
                "(CE). FOREIGN CERTIFICATE \n" +
                "(TI). IDENTITY CARD \n" +
                "(PP). PASSPORT \n");
        String typeId = scan.nextLine();
        System.out.println(" ");
        System.out.println("------ENTER THE DOCUMENT NUMBER------");
        System.out.println(" ");
        String numberId = scan.nextLine();

        try{

            miniMarket.addClients(typeId,numberId);

        }catch(YoungerException motive1){
            System.out.println("--" + motive1);

        }catch (DayOfExitException motive){
            System.out.println(" ");
            System.out.println("-- " + motive);

        }
        //System.out.println("IT HAS BEEN REGISTERED CORRECTLY");
        System.out.println("Penultimate digit of your "+ typeId.toUpperCase() + " is: " + miniMarket.getNumberId());
        System.out.println("Today is the: " + LocalDate.now().getDayOfMonth() + "th" + " of the month");
        menu();

    }

    public void count(){
        System.out.println("The number of people who have tried to enter are: " + miniMarket.getCount());
        menu();
    }
}
