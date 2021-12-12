// A Simple Java program to show multiple
// type parameters in Java Generics

// We use < > to specify Parameter type
class test5<A, B>
{
    A obj1;
    B obj2;
    test5(A obj1, B obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
class Main
{
    public static void main (String[] args)
    {
        test5 <String, Integer> obj =
                new test5<String, Integer>("Abhishek", 109);

        obj.print();
    }
}

