package day10.ey;
import java.time.LocalDate;  
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.Period;

public class Durationdiff {
    public static void main(String[] args) throws Exception {
        LocalDate d1 = LocalDate.parse("2022-02-20", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d2 = LocalDate.parse("2022-02-23", DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDate d3 = LocalDate.parse("2018-05-06", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d4 = LocalDate.parse("2020-01-23", DateTimeFormatter.ISO_LOCAL_DATE);

        Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
        Period period = Period.between(d3, d4);

        long diffDays = diff.toDays();
        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());
        System.out.println("Diffrence between dates is : "+diffDays + "days");
        System.out.println("Diffrence is : "+years+" year, "+months+" months, "+days+" days");
    }
}