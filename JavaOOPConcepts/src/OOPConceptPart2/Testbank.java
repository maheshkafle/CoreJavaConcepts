package OOPConceptPart2;

public class Testbank {

    public static void main(String[] args) {
        // Interview Question: interface variable value is final in nature i.e we cannot change interface variable value USBank.min_bal = 200; is wrong
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
