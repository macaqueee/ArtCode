package artcode_post.controller;

import artcode_post.db.AppDataContainer;
import artcode_post.model.*;
import artcode_post.utils.MyDynamicArray;
import javafx.print.PaperSource;

/**
 * Created by macaque on 02.07.2016.
 */
public class ManagerController {

    private AppDataContainer appDataContainer;


    public ManagerController(AppDataContainer appDataContainer) {
        this.appDataContainer = appDataContainer;
    }

    public static Transaction createTicket(Client client, Item[] items, Address from, Address to){
        return  null;
    }

    public static Transaction filterTransactionById(String Id){
        return null;
    }

    public Transaction filterTransactionByClientPhone(String phone){
        return null;
    }

    public Client getClient(String phone){
        Object[] clienArr =  appDataContainer.getClients().toArray();
        for (int i = 0; i < clienArr.length; i++) {
            Client iterClient = (Client) clienArr[i];
            if (iterClient.getPhone().equals(phone)){
                return iterClient;
            }
        }
        return null; //no client with current phone
    }

    public Client addClient(Passport passport, String phone){

        //validation input
        Client  client = new Client(phone, passport);
        appDataContainer.getClients().add(client);
        return client;
    }
}

