package design.pattern.facade;

public class main {
    public static void main(String[] args) {
        var facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.endDay();
    }
}
