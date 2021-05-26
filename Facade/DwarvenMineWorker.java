package Facade;

import java.util.Arrays;

/*
DwarvenMineWorker
 */
public abstract class DwarvenMineWorker {
    public abstract String name();

    public void goToSleep(){
        System.out.printf("%s goes to sleep.\n", name());
    }

    public void wakeUp(){
        System.out.printf("%s goes to wakeUp.\n", name());
    }

    public void goHome(){
        System.out.printf("%s goes to home.\n", name());
    }

    public void goToMine(){
        System.out.printf("%s goes to mine.\n", name());
    }

    enum Action{
        GO_TO_SLEEP,
        WAKE_UP,
        GO_HOME,
        GO_TO_MINE,
        WORK
    }

    public abstract void work();

    private void action(Action action){
        switch (action) {
            case GO_TO_SLEEP:
                goToSleep();
                break;

            case WAKE_UP:
                wakeUp();
                break;
            
            case GO_HOME:
                goHome();
                break;

            case GO_TO_MINE:
                goToMine();
                break;
            
            case WORK:
                work();
                break;
            
            default:
                System.out.print("Undefine action!");
                break;
        }
    }

    public void action(Action... actions) {
        Arrays.stream(actions).forEach(this::action);
    }
}
