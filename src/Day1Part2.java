import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1Part2 {
    public static void main(String[] args) {
        //part 1
        Scanner in = null;
        try {
            in = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        double fuel = 0;
        double fuelrounden;
        double totalfuel = 0;
        double fuelrounded2;

        while (in.hasNext()) {
            double modeulMass = in.nextInt();
            fuel = (modeulMass / 3) - 2;
            fuelrounden = Math.floor(fuel);

        }
        System.out.println(totalfuel);
    }
}
