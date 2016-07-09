package week3.fin;

/**
 * Created by macaque on 06.07.2016.
 */
public class CloudAccount {

    private String name;
    private String pass;

    public CloudAccount(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
