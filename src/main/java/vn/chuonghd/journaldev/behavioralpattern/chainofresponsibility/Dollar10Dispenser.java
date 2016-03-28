package vn.chuonghd.journaldev.behavioralpattern.chainofresponsibility;

/**
 * Created by huynhduychuong on 3/28/2016.
 */
public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;


    public void setNextChain(DispenseChain chain) {

        this.dispenseChain = chain;
    }

    public void dispense(Currency currency) {

        if (currency.getAmount() >= 20) {
            int amount = currency.getAmount() / 20;
            int remain = currency.getAmount() % 20;

            System.out.println("Dispensing " + amount + " 20$ note");
            if (remain > 0) {
                this.dispenseChain.dispense(new Currency(remain));
            }
        } else {
            this.dispenseChain.dispense(currency);
        }
    }

}
