import java.util.Scanner;

public class MainMaximum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int percent;
        while (true) {
            System.out.println("Enter percent from 0 till 100,  to exit program any other number");
            percent = scanner.nextInt();
            if (percent < 0 || percent > 100) {
                System.out.println(" Goodbye");
                break;
            }
            MoonPhases.print(valueOf(percent));
        }
        scanner.close();

    }

    public static MoonPhases valueOf(int percent) {

        if (percent == 0) {
            return MoonPhases.NEW_MOON;
        }
        if (percent == 100) {
            return MoonPhases.FULL_MOON;
        }
        if (percent < 50) {
            return MoonPhases.WAXING_CRESCENT;
        }
        if (percent == 50) {
            return MoonPhases.FIRST_QUARTER;
        }
        if (percent < 100) {
            return MoonPhases.WAXING_GIBBOUS;
        }
        return null;
    }


}

