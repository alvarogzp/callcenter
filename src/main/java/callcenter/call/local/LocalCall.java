package callcenter.call.local;

import callcenter.Subscriber;
import callcenter.call.Call;

import java.util.Date;

public class LocalCall extends Call {
    private static final int LOCAL_CALL_COST_IN_CENTS_PER_SECOND = 15;

    public LocalCall(Subscriber source, Subscriber destination, Date start, long durationSeconds) {
        super(source, destination, start, durationSeconds);
    }

    @Override
    public float getCost() {
        return LOCAL_CALL_COST_IN_CENTS_PER_SECOND * durationSeconds / 100.0f;
    }
}
