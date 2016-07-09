package week3.fin;

import sun.security.x509.IPAddressName;

/**
 * Created by macaque on 06.07.2016.
 */
public class TestIPhone {

    public static void main(String[] args) {
        final int val = 234;
        int copy = val;

        IPhone iPhone = new IPhone();

        iPhone.getFlashMemory();
        iPhone.getAccount().setName("Vasia");
    }

}

