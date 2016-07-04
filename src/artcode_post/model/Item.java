package artcode_post.model;

import artcode_post.model.Client;
import artcode_post.model.Size;

/**
 * Created by macaque on 02.07.2016.
 */
public class Item {
    private String name;
    private Size size;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
