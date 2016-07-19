package week4.IO;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;


/**
 * Created by macaque on 15.07.2016.
 */
public class TestRobot {

    public static void main(String[] args){
        Gson gson = new Gson();
        ArrayList arrayList = new ArrayList<>();
        String location = "D:\\java\\ArtCode_git\\src\\temp\\test.txt";
        Robot robot = new Robot("Android", 500);
        Robot robot1 = new Robot("Cisco",100);
        arrayList.add(robot);
        arrayList.add(robot1);
        String json = gson.toJson(arrayList);
        System.out.println(json);
        Robot.writeRobot(robot,location);
        try {
            Robot.readRobot(location);
            System.out.println("loaded");
            System.out.println(robot.readRobot(location));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
