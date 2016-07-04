package artcode_post.model;

/**
 * Created by macaque on 02.07.2016.
 */
public class Branch {
    private int numBranch;
    private Address address;

    public Branch(int numBranch, Address address) {
        if  (numBranch != 0 && address != null) {
            this.numBranch = numBranch;
            this.address = address;
        }
    }

    public int getNumBranch() {
        return numBranch;
    }

    public void setNumBranch(int numBranch) {
        this.numBranch = numBranch;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
