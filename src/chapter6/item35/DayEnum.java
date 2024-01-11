package chapter6.item35;

public enum DayEnum {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3);

    private final int dayNumber;

    DayEnum(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public static void main(String[] args) {
        DayEnum day = DayEnum.MONDAY;
        System.out.println("day = " + day);
    }
}
