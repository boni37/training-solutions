package initializer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditCard {

    private long balance;
    public static final List<Rate> ACTUAL_RATES = new ArrayList<>();

    static {
        ACTUAL_RATES.add(new Rate(Currency.HUF, 1.0));
        ACTUAL_RATES.add(new Rate(Currency.EUR, 308.23));
        ACTUAL_RATES.add(new Rate(Currency.SFR, 289.24));
        ACTUAL_RATES.add(new Rate(Currency.GBP, 362.23));
        ACTUAL_RATES.add(new Rate(Currency.USD, 289.77));
    }



    public CreditCard(long balance, Currency currency,List<Rate> rates) {
        ACTUAL_RATES.addAll(rates);
        this.balance = Math.round(balance* getConversionRate(currency));
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public boolean payment(long amount, Currency currency){
        long value = Math.round(amount * getConversionRate(currency));
        if (value <= balance) {
            balance -= value;
            return true;
        }
        return false;
    }

    public boolean payment(long amount){
        return payment(amount,Currency.HUF);
    }

    private double getConversionRate(Currency currency) {
        for (Rate rate : ACTUAL_RATES) {
            if (rate.getCurrency() == currency) {
                return rate.getConversionFactor();
            }
        }
        return 1.0;
    }
}
