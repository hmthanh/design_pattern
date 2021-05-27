package coursera.exercise.facade;

import java.math.BigDecimal;

/**
 * IAccount
 */
public interface IAccount {

    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(IAccount account, BigDecimal amount);
    public int getAccountNumber();
}