package artcode_post.model;

/**
 * Created by macaque on 02.07.2016.
 */
public class Address {
    private String city;
    private String street;
    private int houseNum;

    public Address(String city, String street, int houseNum) {
        if (city != null && street != null && houseNum != 0) {
            this.city = city;
            this.street = street;
            this.houseNum = houseNum;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }
}
