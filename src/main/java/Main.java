import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

    DATE_FORMAT dateFrom = new DATE_FORMAT(27,7,2020);
    �IME_FORMAT timeFrom = new �IME_FORMAT(20,31,0);

    DATE_FORMAT dateTo = new DATE_FORMAT(28,7,2022);
    �IME_FORMAT timeTo = new �IME_FORMAT(20,31,0);

    DATE_FORMAT dateTest = new DATE_FORMAT(31,12,2021);
    �IME_FORMAT timeTest = new �IME_FORMAT(20,31,0);

    System.out.println(dateInRange(dateFrom,timeFrom,dateTo,timeTo,dateTest,timeTest));
    }

    static boolean dateInRange(DATE_FORMAT dateFrom, �IME_FORMAT timeFrom, DATE_FORMAT dateTo, �IME_FORMAT timeTo, DATE_FORMAT dateTest, �IME_FORMAT timeTest){
        boolean isRange = false;

        LocalDateTime from = LocalDateTime.of(dateFrom.getYyyy(), dateFrom.getMm(), dateFrom.getDd(), timeFrom.getHh(),timeFrom.getMm(),timeFrom.getSs());
        ZonedDateTime zonedDateTime = from.atZone(ZoneId.of("America/Los_Angeles"));
        long a = zonedDateTime.toInstant().toEpochMilli(); 

        LocalDateTime to = LocalDateTime.of(dateTo.getYyyy(), dateTo.getMm(), dateTo.getDd(), timeTo.getHh(), timeTo.getMm(), timeTo.getSs());
        zonedDateTime = to.atZone(ZoneId.of("America/Los_Angeles"));
        long b = zonedDateTime.toInstant().toEpochMilli();

        LocalDateTime test = LocalDateTime.of(dateTest.getYyyy(), dateTest.getMm(), dateTest.getDd(), timeTest.getHh(), timeTest.getMm(),timeTest.getSs());
        zonedDateTime = test.atZone(ZoneId.of("America/Los_Angeles"));
        long c = zonedDateTime.toInstant().toEpochMilli();

        if (c>=a && c<=b){
            isRange = true;
        }
        return isRange;
    }
}
