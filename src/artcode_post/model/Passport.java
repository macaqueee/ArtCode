package artcode_post.model;

/**
 * Created by macaque on 02.07.2016.
 */
public class Passport{
    private String fullName;
    private String numberPassport;

    public Passport(String fullName, String numberPassport) {
        if (fullName != null && numberPassport != null) {
            this.fullName = fullName;
            this.numberPassport = numberPassport;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    public String asString(){
        return fullName + " " + numberPassport;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "fullName='" + fullName + '\'' +
                ", numberPassport='" + numberPassport + '\'' +
                '}';
    }
}
