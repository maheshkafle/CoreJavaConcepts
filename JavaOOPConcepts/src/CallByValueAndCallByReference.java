public class CallByValueAndCallByReference {

        int p;
        int q;

    public static void main(String[] args) {
        CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
        int a = 5;
        int b = 5;
        obj.sum(a, b); // Interview Question: call by value or pass by value. Note: Here the value of a and b is unchanged

        obj.p = 20;
        obj.q = 30;

        // Interview Question: Can we implement callbyreference in java: Yes (using object reference)
        System.out.println("Before callbyreference-> p: "+obj.p);
        System.out.println("Before callbyreference-> q: "+obj.q);

        obj.swap(obj); // we pass object reference

        System.out.println("After callbyreference-> p: "+obj.p);
        System.out.println("After callbyreference-> q: "+obj.q);
    }

    public int sum(int a, int b){ // a:5, b: 5
        a = 20; // a: 20
        b = 30; // b: 30
        int c = a + b; // c = 50 not 10
        return c;
    }

    // call by reference
    public void swap(CallByValueAndCallByReference obj){
        int temp;
        temp = obj.p; // temp: 20
        obj.p = obj.q; // t.p: 30
        obj.q = temp; // t.q: 20
    }
}
