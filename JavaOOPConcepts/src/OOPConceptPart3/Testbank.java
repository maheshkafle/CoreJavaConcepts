package OOPConceptPart3;

import OOPConceptPart3.StandardCharteredBank;
import OOPConceptPart3.USBank;

public class Testbank {

    public static void main(String[] args) {

        /*
            Interview Question:
            Q:  Can we change interface variable value e.g USBank.min_bal = 200;
            Ans:    we cannot change interface variable value (It will be wrong, why?) becuase interface variable value is final in nature.

            Q.  Can we write as new USBank(); ?
            Ans:    No we cannot because we cannot create object of interface i.e Interface is abstract in nature
        */

        System.out.println(USBank.min_bal);
        StandardCharteredBank sc = new StandardCharteredBank();
        sc.credit();
        sc.debit();
        sc.transferMoney();
        sc.educationLoan();
        sc.carLoan();
        sc.mutualFund();

        // Dynamic Polymorphism:?
        // Child class object can be referred by parent interface reference var.
        System.out.println("******using parent interface object reference *******");
        USBank ub = new StandardCharteredBank();
        ub.credit();
        ub.debit();
        ub.transferMoney();
        // only overridden method can be called by parent object reference not child class method

    }
}
