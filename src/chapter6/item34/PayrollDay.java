package chapter6.item34;

public enum PayrollDay {
    MONDAY(PayType.WEEKDAY), TUESDAY(PayType.WEEKDAY), WEDNESDAY(PayType.WEEKDAY), THURSDAY(PayType.WEEKDAY),
    FRIDAY(PayType.WEEKDAY), SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);

    private final PayType payType;

    PayrollDay(PayType payType) {
        this.payType = payType;
    }

    public int pay(int minutesWorked, int payRate) {
        return payType.pay(minutesWorked, payRate);
    }

    // 전략 열거 타입
    // 평일과 주말에 대한 임금을 계산 코드
    public enum PayType {
        WEEKDAY {
            @Override
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked <= MINS_PER_SHIFT ? 0 : (minsWorked - MINS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            @Override
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked * payRate / 2;
            }
        };

        // 초과 근무 수당 계산
        abstract int overtimePay(int mins, int payRate);

        // 8시간을 분 단위로 환산한 것, 표준 근무 시간
        private static final int MINS_PER_SHIFT = 8 * 60;

        // 근무 시간과 시급에 따른 임금
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
