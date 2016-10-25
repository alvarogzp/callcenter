package callcenter;

import callcenter.call.Call;
import callcenter.call.CallFactory;
import callcenter.call.provincial.Zone;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
    private Subscriber pepe = new Subscriber("Pepe", "666555444", Location.BADAJOZ);
    private Subscriber manolo = new Subscriber("Manolo", "777666555", Location.GRANADA);
    private Subscriber juana = new Subscriber("Juana", "555666444", Location.BADAJOZ);
    private Subscriber maria = new Subscriber("María", "444555666", Location.GRANADA);

    public void run() {
        List<Call> calls = new ArrayList<>();

        calls.add(call(pepe, manolo, date(20, 15, 25), 300, Zone.ZONE_1));
        calls.add(call(juana, maria, date(10, 5, 5), 30, Zone.ZONE_2));
        calls.add(call(pepe, juana, date(22, 15, 25), 3000, Zone.ZONE_3));
        calls.add(call(maria, manolo, date(18, 15, 25), 3, Zone.ZONE_1));
        calls.add(call(manolo, juana, date(3, 15, 25), 30, Zone.ZONE_2));
        calls.add(call(maria, pepe, date(18, 15, 25), 300, Zone.ZONE_3));

        System.out.println("Total de llamadas: " + calls.size());
        System.out.println();

        for (Call call : calls) {
            System.out.println(call.toString());
            System.out.println();
        }
    }

    private Call call(Subscriber source, Subscriber destination, Date start, long durationSeconds, Zone zone) {
        return CallFactory.createCall(source, destination, start, durationSeconds, zone);
    }

    private Date date(int hour, int minute, int seconds) {
        return new GregorianCalendar(2016, 10, 25, hour, minute, seconds).getTime();
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
