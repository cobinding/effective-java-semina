package chapter6.item35;

public enum DayOrdinal {
    MONDAY,
    TUESDAY,
    WEDNESDAY;

    // ordinal 메서드를 사용하여 열거 상수 위치 반환
    public int getDayOrdinal() {
        return ordinal() + 1;
    }

    public static void main(String[] args) {
        DayOrdinal dayOrdinal = DayOrdinal.WEDNESDAY;
        System.out.println("dayOrdinal = " + dayOrdinal.getDayOrdinal());
    }
}
