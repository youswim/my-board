package com.sy.myboardservice.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Util {

    public static class TimeFormat {

        private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy.MM.dd(EEE) HH:mm:ss", Locale.KOREA);
        public static String reformatLocalDateTime(LocalDateTime localDateTime) {
            return localDateTime.format(formatter);
        }
    }
}
