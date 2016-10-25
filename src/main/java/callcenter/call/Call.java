package callcenter.call;

import callcenter.Subscriber;

import java.util.Date;

public abstract class Call {
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

    @Override
    public String toString() {
        return "Llamada.\n" +
                "Origen: " + source + "\n" +
                "Destino: " + destination + "\n" +
                "Hora de inicio: " + start + "\n" +
                "Duración: " + durationSeconds + " segundos\n" +
                "Coste: " + String.format("%.2f", getCost()) + " €";
    }

    public abstract float getCost();
}
