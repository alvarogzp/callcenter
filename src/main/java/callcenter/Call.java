package callcenter;

import java.util.Date;

public class Call {
    private static final int LOCAL_CALL_COST_IN_CENTS_PER_SECOND = 15;

    public final Subscriber source;
    public final Subscriber destination;
    public final Date start;
    public final long durationSeconds;

    public Call(Subscriber source, Subscriber destination, Date start, long durationSeconds) {
        this.source = source;
        this.destination = destination;
        this.start = start;
        this.durationSeconds = durationSeconds;
    }

    public String toString() {
        return "Llamada.\n" +
                "Origen: " + source + "\n" +
                "Destino: " + destination + "\n" +
                "Hora de inicio: " + start + "\n" +
                "Duración: " + durationSeconds + " segundos\n" +
                "Coste: " + String.format("%.2f", getCost()) + " €";
    }

    public float getCost() {
        if (isLocalCall()) {
            return calculateLocalCost();
        } else {
            return calculateProvincialCost();
        }
    }

    public boolean isLocalCall() {
        return source.location == destination.location;
    }

    private float calculateLocalCost() {
        return LOCAL_CALL_COST_IN_CENTS_PER_SECOND * durationSeconds / 100.0f;
    }

    private float calculateProvincialCost() {
        return 0; // TODO taking into account the time frame when the call was done
    }
}
