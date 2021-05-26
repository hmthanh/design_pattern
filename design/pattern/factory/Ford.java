package design.pattern.factory;


/**
 * Ford
 */
public class Ford implements Car{

    static final String DESCRIPTION = "This is Ford";
    
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}