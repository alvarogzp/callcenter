package callcenter;

public class Subscriber {
    public final String name;
    public final String phoneNumber;
    public final Location location;

    public Subscriber(String name, String phoneNumber, Location location) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    @Override
    public String toString() {
        return name + " (" + location + ") [" + phoneNumber + "]";
    }
}
