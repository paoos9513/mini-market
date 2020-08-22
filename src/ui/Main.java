package ui;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    int opt;

    public Main(){
        menu();
    }

    public static void main(String[] args){
        new Main();
    }

    public void menu(){

        System.out.println("-----------------MENU-----------------");
        System.out.println("ENTER THE OPTION YOU WANT TO MAKE");
        System.out.println("(1). REGISTER A PERSON");
        System.out.println("(2). CONSULT NUMBER OF PEOPLE WHO CAME");
        System.out.println("(3) EXIT THE PROGRAM");
        opt = Integer.parseInt(scan.nextLine());

        switch (opt){

            case 1:
                optionMenuOne();
                break;
            case 2:
                System.out.println("");
                break;
            case 3:
                scan.close();
                break;
            default:
                System.out.println("The option is incorrect");
        }
    }

    public void optionMenuOne(){

        System.out.println("ENTER THE TYPE OF DOCUMENT");
        System.out.println("(CC). CITIZENSHIP CARD  \n" +
                "(CE). FOREIGN CERTIFICATE \n" +
                "(TI). IDENTITY CARD \n" +
                "(PP). PASSPORT");
        String typeId = scan.nextLine();
        System.out.println("ENTER THE DOCUMENT NUMBER");
        String numberId = scan.nextLine();
        System.out.println("IT HAS BEEN REGISTERED CORRECTLY");
        System.out.println("YOU CAN ENTER");

        System.out.println("el dia es: " + LocalDate.now().getDayOfMonth());

        menu();

    }


}
