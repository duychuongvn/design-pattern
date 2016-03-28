package vn.chuonghd.journaldev.behavioralpattern.chainofresponsibility;

/**
 * Created by huynhduychuong on 3/28/2016.
 */
public class Dollar20Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;


    public void setNextChain(DispenseChain chain) {

        this.dispenseChain = chain;
    }

    public void dispense(Currency currency) {

        if (currency.getAmount() >= 50) {
            int amount = currency.getAmount() / 50;
            int remain = currency.getAmount() % 50;

            System.out.println("Dispensing " + amount + " 50$ note");
            if (remain > 0) {
                this.dispenseChain.dispense(new Currency(remain));
            }
        } else {
            this.dispenseChain.dispense(currency);
        }
    }

}
