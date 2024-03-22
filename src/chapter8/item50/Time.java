package chapter8.item50;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        ZonedDateTime nowEuropeParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        ZonedDateTime nowAsiaSeoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

        System.out.println("nowEuropeParis = " + nowEuropeParis);
        System.out.println("nowAsiaSeoul = " + nowAsiaSeoul);
    }
}

