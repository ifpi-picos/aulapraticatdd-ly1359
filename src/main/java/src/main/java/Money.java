package src.main.java;

public class Money {

    protected int amount;
    protected String currency;
    
    public String currency() {
        return currency;
    }

    public int amount() {
        return amount;
    }

    public Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

   
    public boolean equals(Object object)  {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
   }   
}
