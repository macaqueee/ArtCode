package artcode_post.db;

import artcode_post.utils.MyDynamicArray;

/**
 * Created by macaque on 04.07.2016.
 */
public class AppDataContainer {
    private MyDynamicArray clients;
    private MyDynamicArray transactions;
    private MyDynamicArray drivers;

    public AppDataContainer(){
        clients = new MyDynamicArray();
        transactions = new MyDynamicArray();
        drivers = new MyDynamicArray();
    }

    public MyDynamicArray getClients() {
        return clients;
    }

    public MyDynamicArray getTransactions() {
        return transactions;
    }

    public MyDynamicArray getDrivers() {
        return drivers;
    }
}
