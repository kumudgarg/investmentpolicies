import fundchoices.Fund;
import fundchoices.FundCalculator;
import fundchoices.FundsReturnType;
import fundchoices.Share;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RetireMentFunds {

    public static void main(String[] args) {

        int count = 1;
        List<Double> list1 = new ArrayList<>();
        FundCalculator fundCalculator = new FundCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your amount");
        list1.add(sc.nextDouble());
        System.out.println("Enter duration");
        double duration = sc.nextDouble();

        List<Double> list = fundCalculator.calculate(name, list1, duration);
        for (Double fund: list) {
            System.out.println("Fund" + count++ + "amount ===> " + fund);

        }



    }


}
