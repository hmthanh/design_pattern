package design.pattern.facade;

public class DwarvenCartOperator extends DwarvenMineWorker{
    @Override
    public String name() {
        return "Dwarf cart operator";
    }

    @Override
    public void work() {
        System.out.printf("%s moves gold chunks out of the mine.\n", name());
    }
}
