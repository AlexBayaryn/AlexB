package task3;

import java.util.Scanner;

/**
 * Создать класс Календарь с внутренним классом,
 * с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalendarHoliday calendarHoliday = new CalendarHoliday();
        calendarHoliday.setHoliday(scanner, System.out);
        System.out.println(calendarHoliday.getHolidayList());
    }
}
