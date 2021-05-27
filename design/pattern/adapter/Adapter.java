package design.pattern.adapter;

public class Adapter {
    public static void main(String[] args) {
        var captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
