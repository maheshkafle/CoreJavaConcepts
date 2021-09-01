package OOPConceptPart2;

public class Testbank {

    public static void main(String[] args) {

        StandardCharteredBank sc = new StandardCharteredBank();
        sc.credit();
        sc.debit();
        sc.transferMoney();
        sc.educationLoan();
        sc.carLoan();

        // Dynamic Polymorphism:?
        // Child class object can be referred by parent interface reference var.
        USBank ub = new StandardCharteredBank();
        ub.credit();
        ub.debit();
        ub.transferMoney();
        // only overridden method can be called by parent object reference not child class method

    }
}
