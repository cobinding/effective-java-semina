package chapter9.item60;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {

    public static void main(String[] args) {
        // 문자열로 초기화
        BigDecimal a = new BigDecimal("1.03");
        BigDecimal b = new BigDecimal("0.42");

        // 사칙 연산
        System.out.println(a.add(b)); // 1.03 + 0.42 = 1.45
        System.out.println(a.subtract(b)); // 1.03 - 0.42 = 0.61

        // 기본 상수
        System.out.println(BigDecimal.ONE);
        System.out.println(BigDecimal.TEN);

        // 소수점 처리
        System.out.println(a.setScale(0, RoundingMode.UP)); // 2
        System.out.println(a.setScale(0, RoundingMode.CEILING)); // 2
        System.out.println(a.setScale(0, RoundingMode.HALF_UP)); // 1


    }

}
