package design_patterns.decorator;

import java.io.*;

/**
 * Created by macaque on 15.07.2016.
 */
public class TestDecorator {

    public static void main(String[] args) throws IOException {
        ActionNode actionNode2 = new ActionNode("2",null);

        ActionNode actionNode1 = new ActionNode("1",actionNode2);

        ActionNode actionNode = new ActionNode("0",actionNode1);

        String res = actionNode.action();

        String name = "temp/test.txt";
        DataInputStream dataInputStream =  new DataInputStream(new BufferedInputStream(new FileInputStream(name)));

        int next = dataInputStream.readInt();
    }
}
