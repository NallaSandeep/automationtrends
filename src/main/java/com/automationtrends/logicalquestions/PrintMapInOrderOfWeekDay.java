package com.automationtrends.logicalquestions;

import java.util.HashMap;
import java.util.Map;

public class PrintMapInOrderOfWeekDay {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Monday", "21-04-2022");
        map.put("Sunday", "20-04-2022");
        map.put("Friday", "25-04-2022");
        map.put("Wednesday", "23-04-2022");
        map.put("Thursday", "24-04-2022");
        map.put("Tuesday", "22-04-2022");
        map.put("Saturday", "26-04-2022");
        for (WeekDays e: WeekDays.values()) {
            System.out.println(e.getWeekDay() + " : " + map.get(e.getWeekDay()));
        }
    }


    enum WeekDays {
        A ("Sunday"),
        B ("Monday"),
        C ("Tuesday"),
        D ("Wednesday"),
        E ("Thursday"),
        F ("Friday"),
        G ("Saturday");

        private String weekDay;

        WeekDays(String weekDay) {
            this.weekDay = weekDay;
        }

        public String getWeekDay() {
            return this.weekDay;
        }
    }
}

