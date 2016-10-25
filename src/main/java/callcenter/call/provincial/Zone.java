package callcenter.call.provincial;

public enum Zone {
    ZONE_1(20),
    ZONE_2(25),
    ZONE_3(30);

    public long centsPerSecond;

    Zone(long centsPerSecond) {
        this.centsPerSecond = centsPerSecond;
    }
}
