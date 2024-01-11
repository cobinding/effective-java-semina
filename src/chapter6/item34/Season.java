package chapter6.item34;

public enum Season {
    SPRING("Warm"), // 각 상수는 자체적으로 생성자를 가질 수 있음
    SUMMER("Hot"),
    AUTUMN("Cool"),
    WINTER("Cold");

    private final String description; // 각 상수는 개별적으로 필드를 가질 수 있음

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        Season currentSeason = Season.SUMMER;

        System.out.println("Current season: " + currentSeason);
        System.out.println("Description: " + currentSeason.getDescription());

        // 외부에서 열거 타입의 인스턴스를 직접 생성할 수 없음
        // Season invalidSeason = new Season("Invalid"); // 컴파일 에러

        // 열거 타입은 클래스이므로 다양한 메소드나 필드를 추가할 수 있음
        System.out.println("All seasons:");
        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getDescription());
        }
    }
}