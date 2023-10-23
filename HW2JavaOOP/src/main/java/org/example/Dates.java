package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Dates {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();// 10 октября
LocalDate anather = LocalDate.of(2023, 11,15); // 15 ноября

       LocalDate monthAgo =anather.minus(1, ChronoUnit.MONTHS);
        System.out.println(monthAgo);
boolean after = now.isBefore(anather);

        System.out.println(after);
    }
}
