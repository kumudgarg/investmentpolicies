package fundchoices;

public class Share {

    private double returnPerAnnumRate;

    private double investmentFundRate;

    private double amount;

    public Share(double returnPerAnnumRate, double investmentFundRate) {
        this.returnPerAnnumRate = returnPerAnnumRate;
        this.investmentFundRate = investmentFundRate;
    }

    public Share() {

    }

    public double getReturnPerAnnumRate() {
        return returnPerAnnumRate;
    }

    public void setReturnPerAnnumRate(double returnPerAnnumRate) {
        this.returnPerAnnumRate = returnPerAnnumRate;
    }

    public double getInvestmentFundRate() {
        return investmentFundRate;
    }

    public void setInvestmentFundRate(double investmentFundRate) {
        this.investmentFundRate = investmentFundRate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
