package fundchoices;

import java.util.List;

public class Fund {


    private List<Share> shares;

    private FundsReturnType fundsReturnType;

    public Fund(List<Share> shares, FundsReturnType fundsReturnType) {
        this.shares = shares;
        this.fundsReturnType = fundsReturnType;
    }

    public Fund() {

    }

    public List<Share> getShares() {
        return shares;
    }

    public void setShares(List<Share> shares) {
        this.shares = shares;
    }

    public FundsReturnType getFundsReturnType() {
        return fundsReturnType;
    }

    public void setFundsReturnType(FundsReturnType fundsReturnType) {
        this.fundsReturnType = fundsReturnType;
    }
}
