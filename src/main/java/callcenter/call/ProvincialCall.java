package callcenter.call;

import callcenter.Subscriber;

import java.util.Date;

public class ProvincialCall extends Call {
    public ProvincialCall(Subscriber source, Subscriber destination, Date start, long durationSeconds) {
        super(source, destination, start, durationSeconds);
    }

    @Override
    public float getCost() {
        return 0; // TODO taking into account the time frame when the call was done
    }
}
