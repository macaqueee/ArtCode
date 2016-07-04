package artcode_post.test;

import artcode_post.controller.ManagerController;
import artcode_post.db.AppDataContainer;
import artcode_post.model.Client;
import artcode_post.model.Passport;
import artcode_post.model.Transaction;
import artcode_post.workers.Manager;

import java.util.Date;

/**
 * Created by macaque on 02.07.2016.
 */
public class TestManageController {
    public static void main(String[] args) {
    //    System.out.println(new Date(System.currentTimeMillis()));


        AppDataContainer appDataContainer = new AppDataContainer();

        // test 2



    }

    public  static void getClient(AppDataContainer appDataContainer){
        ManagerController managerController = new ManagerController(appDataContainer);
        String in2 = "073063559345";
        Client expected = new Client("073063559345" , new Passport("CM223232", "Fisenko Oleksii"));
        Client actual2 = managerController.getClient(in2);
        System.out.printf("%s, test get client in2 %s,\n  expected %s,\n actual %s\n",
                actual2.toString().equals(expected.toString()), in2, expected, actual2);
    }

    public static void testAddClient(AppDataContainer appDataContainer){
        ManagerController managerController = new ManagerController(appDataContainer);
        Passport in = new Passport("CM223232", "Fisenko Oleksii");
        String in2 = "073063559345";

        Client actual = managerController.addClient(in, in2 );
        Client expected = new Client("073063559345" , new Passport("CM223232", "Fisenko Oleksii"));

        System.out.printf("%s, test add client in %s ,\n  expected %s,\n actual %s\n",
                actual.toString().equals(expected.toString()), in, expected, actual);
    }
}
