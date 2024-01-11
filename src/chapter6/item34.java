package chapter6;

import static chapter6.item34.PayrollDay.PayType.WEEKDAY;
import static chapter6.item34.PayrollDay.PayType.WEEKEND;


public class item34 {
    // 예시: 열거 타입을 사용하여 계절을 표현하는 클래스

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

    enum PayrollDay {
        MONDAY(WEEKDAY), TUESDAY(WEEKDAY), WEDNESDAY(WEEKDAY), THURDAY(WEEKDAY),
        FRIDAY(WEEKDAY), SATURDAY(WEEKEND), SUNDAY(WEEKEND);

        private final PayType payType;

        PayrollDay(PayType payType) { this.payType = payType; }

        int pay(int minutesWorked, int payRate) {
            return payType.pay(minutesWorked, payRate);
        }

        // 전략 열거 타입
        enum PayType {
            WEEKDAY {
                int overtimePay(int minsWorked, int payRate) {
                    return minsWorked <= MINS_PER_SHIFT ? 0 : (minsWorked - MINS_PER_SHIFT) * payRate / 2;
                }
            },
            WEEKEND {
                int overtimePay(int minsWorked, int payRate) {
                    return minsWorked * payRate / 2;
                }
            };

            abstract int overtimePay(int mins, int payRate);
            private static final int MINS_PER_SHIFT = 8 * 60;

            int pay(int minsWorked, int payRate) {
                int basePay = minsWorked * payRate;
                return basePay + overtimePay(minsWorked, payRate);
            }
        }

        public static void main(String[] args) {
            int weekdayPay = PayrollDay.MONDAY.pay(9 * 60, 10);
            System.out.println("weekdayPay = " + weekdayPay);

            int weekendPay = PayrollDay.SATURDAY.pay(6 * 60, 12);
            System.out.println("weekendPay = " + weekendPay);
        }
    }
}