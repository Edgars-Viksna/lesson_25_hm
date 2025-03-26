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
        System.out.println("--------- method print ---------");
        MoonPhases.print();

        System.out.println("--------- method print any one ---------");
        MoonPhases.print(MoonPhases.FIRST_QUARTER);


    }
}