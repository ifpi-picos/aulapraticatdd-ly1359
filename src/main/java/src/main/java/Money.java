package src.main.java;

public class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public static Money dollar(int amount) {
        return new Money(amount);
    }

    public static Money franc(int amount) {
        return new Money(amount);
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier);
    }
   
    public boolean equals(Object object)  {
        Money money = (Money) object;
        return amount == money.amount;
   }   
}
