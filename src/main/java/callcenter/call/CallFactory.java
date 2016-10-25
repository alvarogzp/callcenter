package callcenter.call;

import callcenter.Subscriber;

import java.util.Date;

public class CallFactory {
    public static Call createCall(Subscriber source, Subscriber destination, Date start, long durationSeconds) {
        if (areLocalSubscribers(source, destination)) {
            return new LocalCall(source, destination, start, durationSeconds);
        } else {
            return new ProvincialCall(source, destination, start, durationSeconds);
        }
    }

    public static boolean areLocalSubscribers(Subscriber source, Subscriber destination) {
        return source.location == destination.location;
    }
}
