package Factory;

import java.util.function.Supplier;

public enum CarType {
    FORD(Ford::new), FERRARI(Ferrari::new);
    private final Supplier<Car> contructor;

    CarType(Supplier<Car> constructor){
        this.contructor = constructor;
    }

    public Supplier<Car> getConstructor() {
        return this.contructor;
    }
}
