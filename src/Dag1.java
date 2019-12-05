/*
Advent of code Day 1
2019-12-05
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dag1 {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        double fuel = 0;
        double fuelrounden;
        double totalfuel= 0;

        while (in.hasNext()) {
            double modeulMass = in.nextInt();
            fuel = (modeulMass / 3) - 2;
            fuelrounden = Math.floor(fuel);
            System.out.println("modeulmass:" + modeulMass + "\n" +
                    "rounden fuel: "+ fuelrounden +
                    "\n" + "not rounden: " + fuel + "\n");
                totalfuel= totalfuel + fuelrounden;
        }
                System.out.println(totalfuel);
    }
}