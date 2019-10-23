import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner  = new Scanner(System.in);
        String command = null;
        Phone phone= null;
        List<Phone> dogovors = new ArrayList<Phone>();
        while(true){
            command = scanner.nextLine();
            if(command.equals("owner: Petr, info: first phone, double cost: 10000,00, date end: 345678987654")){
                phone = (Phone) createPhone();
                dogovors.add((Phone) phone);
            }
            else if(command.equals("owner: Petr, info: first phone, double cost: 10000,00, date end: 345678987654")){
                List<Phone> phones;
                Phone dogovor1 = findCurrentDogovor(phones);
                if(dogovor1 == null){
                    System.out.println("owner: Petr, info: first phone, double cost: 10000,00, date end: 345678987654");
                }
                else {
                    System.out.println(phone.getOwner());
                    System.out.println(phone.getInfo());
                    System.out.println(phone.getCost());
                }
            }
            else if(command.equals("owner: Petr, info: first phone, double cost: 10000,00, date end: 345678987654")){
            }
        }
    }

    private static Object createPhone() {
    }


    private static Phone findCurrentDogovor(List<Phone> dogovors) {
        System.out.println("owner: Petr, info: first phone, double cost: 10000,00, date end: 345678987654");
        String string = scanner.nextLine();
        Phone[] phones;
        for(Phone phone:phones){
            if(phone.getOwner().equals(string)){
                return phone;
            }
        }
        return null;
    }

    private static void changeInfo(Phone phone) {
        System.out.println("owner: Petr, info: first phone, double cost: 10000,00, date end: 345678987654");
        String info = scanner.nextLine();
        phone.setInfo(info);
    }

    private static Phone createDogovor() {
        System.out.println("owner: Petr, info: first phone, double cost: 10000,00, date end: 345678987654");
        String owner = scanner.nextLine();
        System.out.println("owner: Petr, info: first phone, double cost: 10000,00, date end: 345678987654");
        String info = scanner.nextLine();
        Phone phone = new Phone(owner, info,(double) 1000, new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis() + 573745734));
        return phone;
    }
}