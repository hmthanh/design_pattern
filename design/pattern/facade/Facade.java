package design.pattern.facade;

public class Facade {
    public static void main(String[] args) {
        var facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.endDay();
    }
}
