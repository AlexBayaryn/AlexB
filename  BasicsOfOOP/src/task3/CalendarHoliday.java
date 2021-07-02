package task3;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalendarHoliday {
    private List<Holiday> holidayList;
    private int[] data = new int[3];
    private int numberOfDay;
    private int numberOfMonth;
    private int year;
    GregorianCalendar gregCalendar;

    public List<Holiday> getHolidayList() {
        return holidayList;
    }

    private class Holiday {
        private String stringData;
        private String message;

        public Holiday() {
        }

        public Holiday(String stringData, String message) {
            this.stringData = stringData;
            this.message = message;
        }

        private void formatData(String string) {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(string);
            int count = 0;
            while (matcher.find()) {
                int number = Integer.parseInt(matcher.group());
                data[count] = number;
                count++;
            }
            setData(data);
        }

        private void setData(int[] data) {
            for (int i = data.length - 1; i >= 0; i--) {
                if (i == 2) {
                    year = data[i];
                    if (year < 2000) {
                        year += 2000;
                    }
                }
                if (i == 1) {
                    numberOfMonth = data[i] - 1;
                }
                if (i == 0) {
                    numberOfDay = data[i];
                }
            }
        }

        @Override
        public String toString() {
            return stringData + ":- " + message + "\n";
        }
    }

    public CalendarHoliday() {
    }

    public void setHoliday(Scanner scanner, PrintStream out) {
        Holiday holiday = new Holiday();
        holidayList = new ArrayList<>();
        while (true) {
            out.print("Добавить выходной день <y> <n> ? ");
            if (scanner.nextLine().equals("y")) {
                System.out.print("Введите дату дд.мм.гг: ");
                String string = scanner.nextLine();
                holiday.formatData(string);
                gregCalendar = new GregorianCalendar(year, numberOfMonth, numberOfDay);
                String stringData = String.format("%1$ta %1$td %1$tb, %1$tY", gregCalendar);
                System.out.print("Введите сообщение: ");
                String message = scanner.nextLine();
                holidayList.add(new Holiday(stringData, message));
            } else {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "CalendarHoliday " + holidayList;
    }
}
