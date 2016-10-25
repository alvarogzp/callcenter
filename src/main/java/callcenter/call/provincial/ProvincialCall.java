package callcenter.call.provincial;

import callcenter.Subscriber;
import callcenter.call.Call;

import java.util.Date;

public class ProvincialCall extends Call {
    private Zone zone;

    public ProvincialCall(Subscriber source, Subscriber destination, Date start, long durationSeconds, Zone zone) {
        super(source, destination, start, durationSeconds);
        this.zone = zone;
    }

    @Override
    public float getCost() {
        return zone.centsPerSecond * durationSeconds / 100.0f;
    }
}
