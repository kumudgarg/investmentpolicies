package fundchoices;

import java.util.ArrayList;
import java.util.List;

public class FundCalculator {

    private double count;
    private int i;
    private double fundAmount;
    List<Double> amount = new ArrayList<>();
    List<Double> totalProjectedIncome = new ArrayList<>();
    List<Fund> funds = FundFactory.getFunds();

    public List<Double> calculate( String name, List<Double> amount, double duration) {





        if(count >= duration)
        {
            return  totalProjectedIncome;
        }
            double sum = 0;
            for (Fund fund : funds) {
                for (Share share : fund.getShares()) {
                    sum += (share.getInvestmentFundRate() / 100 * share.getReturnPerAnnumRate() / 100);
                }
                if(count > 0) {
                    fundAmount = amount.get(i) + (sum + 1) * amount.get(i);
                    i += 1;
                }else {
                    fundAmount = (sum + 1) * amount.get(i);
                }


                /*count++;
                if(duration > 1)
                {
                    while (count < duration) {
                        fundAmount +=  ((sum + 1) * fundAmount);
                        count++;
                    }
                }*/
                totalProjectedIncome.add(fundAmount);
                /*count = 0;
                sum = 0;*/
                sum = 0;
            }
            i=0;
            count++;
            return calculate(name,totalProjectedIncome,duration);



    }


}
