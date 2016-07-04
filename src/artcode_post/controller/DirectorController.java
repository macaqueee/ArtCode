package artcode_post.controller;

import artcode_post.db.AppDataContainer;

/**
 * Created by macaque on 04.07.2016.
 */
public class DirectorController {
    private AppDataContainer appDataContainer;

    public DirectorController(AppDataContainer appDataContainer){
        this.appDataContainer = appDataContainer;
    }

    public AppDataContainer getAppDataContainer() {
        return appDataContainer;
    }

    public void setAppDataContainer(AppDataContainer appDataContainer) {
        this.appDataContainer = appDataContainer;
    }
}
