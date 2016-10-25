package callcenter;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
    private static Subscriber pepe = new Subscriber("Pepe", "666555444", Location.BADAJOZ);
    private static Subscriber manolo = new Subscriber("Manolo", "777666555", Location.GRANADA);
    private static Subscriber juana = new Subscriber("Juana", "555666444", Location.BADAJOZ);
    private static Subscriber maria = new Subscriber("María", "444555666", Location.GRANADA);

    public static void main(String[] args) {
        List<Call> calls = new ArrayList<>();

        calls.add(new Call(pepe, manolo, getDate(20, 15, 25), 300));
        calls.add(new Call(juana, maria, getDate(10, 5, 5), 30));
        calls.add(new Call(pepe, juana, getDate(22, 15, 25), 3000));
        calls.add(new Call(maria, manolo, getDate(18, 15, 25), 3));
        calls.add(new Call(manolo, juana, getDate(3, 15, 25), 30));
        calls.add(new Call(maria, pepe, getDate(18, 15, 25), 300));

        System.out.println("Total de llamadas: " + calls.size());
        System.out.println();

        for (Call call : calls) {
            System.out.println(call.toString());
            System.out.println();
        }
    }

    private static Date getDate(int hour, int minute, int seconds) {
        return new GregorianCalendar(2016, 10, 25, hour, minute, seconds).getTime();
    }
}
