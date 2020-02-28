package fundchoices;

import java.util.List;

public class FundFactory {

    public static List<Fund> getFunds() {
        Share share1 = new Share(30, 40);
        Share share2 = new Share(35, 20);
        Share share3 = new Share(60, 40);
        Fund highReturnFund = new Fund(List.of(share1, share2, share3), FundsReturnType.HIGH);

        Share share4 = new Share(20, 35);
        Share share5 = new Share(18, 30);
        Share share6 = new Share(12, 35);
        Fund mediumReturnFund = new Fund(List.of(share4, share5, share6), FundsReturnType.MEDIUM);

        Share share7 = new Share(15, 20);
        Share share8 = new Share(10, 30);
        Share share9 = new Share(8, 50);
        Fund lowReturnFund = new Fund(List.of(share7, share8, share9), FundsReturnType.LOW);

        List<Fund> funds = List.of(highReturnFund, mediumReturnFund, lowReturnFund);
        return funds;
    }
}
