package week3.fin;

/**
 * Created by macaque on 06.07.2016.
 */
public class IChinaStore extends IShop{
    @Override
    public IPhone buy() {
        return new Xiomi();
    }
}
