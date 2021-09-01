package OOPConceptPart2;

public class StandardCharteredBank implements USBank, BrazilBank{
    // Top Interview Question:
    // Is-a relationship: interface to class relationship
    // Has-a relationship: class to class relationship
    // if a class is implementing any Interface, then its mandatory to define/override all the methods of Interface.

    @Override
    public void credit() {
        System.out.println("StandardChartered: Credit method");
    }

    @Override
    public void debit() {
        System.out.println("StandardChartered: debit method");
    }

    @Override
    public void transferMoney() {
        System.out.println("StandardChartered: transferMoney method");
    }

    @Override
    public void mutualFund() {
        System.out.println("StandardChartered: mutualFunds method");
    }
    public void educationLoan(){
        System.out.println("StandardChartered: educationLoan");
    }

    public void carLoan(){
        System.out.println("StandardChartered: carLoan");
    }
}
