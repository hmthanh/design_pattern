package design.pattern.adapter;

public class FishingBoatAdapter implements RowingBoat {
    private final FishingBoat boat;

    public FishingBoatAdapter() {
        boat = new FishingBoat();
    }

    @Override
    public void row() {
        boat.sail();
    }
}
