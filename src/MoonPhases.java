public enum MoonPhases {

    NEW_MOON(" \uD83C\uDF11 " + 0 + "%"),
    WAXING_CRESCENT(" \uD83C\uDF12\n " + 1 + "-" + 49 + "%"),
    FIRST_QUARTER(" \uD83C\uDF13 " + 50 + "%"),
    WAXING_GIBBOUS(" \uD83C\uDF14 " + 51 + "-" + 99 + "%"),
    FULL_MOON(" \uD83C\uDF15 " + 100 + "%"),
    WANING_GIBBOUS(" \uD83C\uDF16 " + 99 + "-" + 51 + "%"),
    LAST_QUARTER(" \uD83C\uDF17 " + 50 + "%"),
    WANING_CRESCENT(" \uD83C\uDF18 " + 49 + "-" + 1 + "%");

    private final String description;

    MoonPhases(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void print() {
        for (MoonPhases phases : MoonPhases.values()) {
            System.out.println(phases + " " + phases.getDescription());
        }
    }

    public static void print(MoonPhases phase) {
        System.out.println(phase + " " + phase.getDescription());
    }


}
