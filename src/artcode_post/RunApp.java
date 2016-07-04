package artcode_post;

import artcode_post.controller.DirectorController;
import artcode_post.controller.ManagerController;
import artcode_post.db.AppDataContainer;

/**
 * Created by macaque on 04.07.2016.
 */
public class RunApp {

    public static void main(String[] args) {
        AppDataContainer appDataContainer =  new AppDataContainer();

        DirectorController directorController = new DirectorController(appDataContainer);
        ManagerController managerController = new ManagerController(appDataContainer);
    }
}
