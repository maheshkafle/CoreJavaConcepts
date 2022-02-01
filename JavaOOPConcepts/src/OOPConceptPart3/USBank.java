package OOPConceptPart3;

public interface USBank {

    int min_bal = 100;

    public void credit();

    public void debit();

    public void transferMoney();

    // Interface Interview Questions.
    // only method declaration
    // no method body - only method prototypes.
    // In interface, we can declare the variables, vars are default static in nature
    // vars value will not be changed; i.e it is final/constant in nature
    // no static method in Interface why? because interface are oops concepts and object doesn't have static method
    // we cannot create the object of Interface i.e It is abstract in nature
}
