import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Задачи минимум:
- написать свой enum MoonPhases с такими значениями: NEW_MOON, WAXING_CRESCENT, FIRST_QUARTER,
WAXING_GIBBOUS, FULL_MOON, WANING_GIBBOUS, LAST_QUARTER, WANING_CRESCENT
- задать свойство типа String которое будет показывать насколько освещена луна в такой то фазе (в
процентном соотношении), например: FULL_MOON(“100%”), NEW_MOON(“0%”)
- вывести все значения MoonPhases
- получить объект MoonPhases на основе пользовательского вода и сделать обработку в switch: если
FULL_MOON - вывести одно, если NEW_MOON - другое, иначе - третье
 */
//        System.out.println("--------- method print ---------");
//        MoonPhases.print();
//
//        System.out.println("--------- method print any one ---------");
//        MoonPhases.print(MoonPhases.FIRST_QUARTER);

        System.out.println("--------- получить объект MoonPhases ... ---------");
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.println("To get information about the phases of the moon:\n" +
                    "  enter 1 for NEW_MOON,\n" +
                    "  enter 2 for WAXING_CRESCENT,\n" +
                    "  enter 3 for FIRST_QUARTER,\n" +
                    "  enter 4 for WAXING_GIBBOUS,\n" +
                    "  enter 5 for FULL_MOON,\n" +
                    "  enter 6 for WANING_GIBBOUS,\n" +
                    "  enter 7 for LAST_QUARTER,\n" +
                    "  enter 8 for WANING_CRESCENT,\n" +
                    "  enter 0 for exit from programm");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    MoonPhases.print(MoonPhases.NEW_MOON);
                    break;
                case 2:
                    MoonPhases.print(MoonPhases.WAXING_CRESCENT);
                    break;
                case 3:
                    MoonPhases.print(MoonPhases.FIRST_QUARTER);
                    break;
                case 4:
                    MoonPhases.print(MoonPhases.WAXING_GIBBOUS);
                    break;
                case 5:
                    MoonPhases.print(MoonPhases.FULL_MOON);
                    break;
                case 6:
                    MoonPhases.print(MoonPhases.WANING_GIBBOUS);
                    break;
                case 7:
                    MoonPhases.print(MoonPhases.LAST_QUARTER);
                    break;
                case 8:
                    MoonPhases.print(MoonPhases.WANING_CRESCENT);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("invalid number, enter a number between 1 and 8");
            }
        } while (input != 0);
    }


}