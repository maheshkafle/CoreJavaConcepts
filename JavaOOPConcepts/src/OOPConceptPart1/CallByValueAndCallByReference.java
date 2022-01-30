package OOPConceptPart1;

public class CallByValueAndCallByReference {

        int p;
        int q;

    public static void main(String[] args) {
        CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
        int a = 5;
        int b = 5;
        /*
            Interview Question: call by value or pass by value.
            Note: Here the value of 'a' variable(actual parameter) is copied into 'a'(formal parameters)
        */
        obj.sum(a, b);

        obj.p = 20;
        obj.q = 30;

        // Interview Question: Can we implement callbyreference in java: Yes (using object reference)
        System.out.println("Before swap");
        System.out.println("p: "+obj.p);
        System.out.println("q: "+obj.q);

        /*
            Interview Question: call by reference or pass by reference.
            Note: In call by reference, the memory allocation is similar for both formal and actual parameters.
            All operations in function are performed on the value stored at the address of actual params,
            and the value gets stored at same address.
        */
        obj.swap(obj); // we pass object reference

        System.out.println("After swap");
        System.out.println("p: "+obj.p);
        System.out.println("q: "+obj.q);
    }

    public int sum(int a, int b){ // a:5, b: 5
        a = 20; // a: 20
        b = 30; // b: 30
        int c = a + b; // c = 50 not 10
        return c;
    }

    // call by reference: If the original parameter
    public void swap(CallByValueAndCallByReference obj){
        int temp;
        temp = obj.p; // temp: 20
        obj.p = obj.q; // t.p: 30
        obj.q = temp; // t.q: 20
    }
}
