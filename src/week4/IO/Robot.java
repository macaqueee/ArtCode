package week4.IO;

import java.io.*;

/**
 * Created by macaque on 15.07.2016.
 */
public class Robot {

    public String name;
    public int price;


    public Robot(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static void writeRobot(Robot robot, String location){
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(location));
            printWriter.println(robot.name);
            System.out.println("write was ok");
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readRobot(String location) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(location));
            return bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
    }
}
