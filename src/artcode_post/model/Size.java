package artcode_post.model;

/**
 * Created by macaque on 02.07.2016.
 */
public class Size {
    private int length;
    private int height;
    private int width;
    private int weight;

    public Size(int length, int height, int width, int weight) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}