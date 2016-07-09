package week3.fin;

import com.sun.org.apache.bcel.internal.generic.ISHL;

/**
 * Created by macaque on 06.07.2016.
 */
public class ClientStoreTest {

    public static void main(String[] args) {
        IShop shop = visit();
        IPhone iPhone = shop.buy();

        iPhone.start();

        shop.buy();
    }

    public static IShop visit(){
        return new IChinaStore();
    }
}
