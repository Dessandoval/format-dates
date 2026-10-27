package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {

    //04/22/2026
    //2026-04-22
    //Wednesday, April 22, 2026
    //Wednesday, Apr 22, 2026 10:02  display in GMT time

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy-dd-MM")));
        System.out.println(today.format(DateTimeFormatter.ofPattern("EEEE, MMMM, d, yyyy")));
        System.out.println(today.format(DateTimeFormatter.ofPattern("EEEE, MMM, d, yyyy")));
    }
}
