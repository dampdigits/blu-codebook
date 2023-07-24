public class FuncCalls
{
    public void nonstaticCalledNonstatic()
    {
        System.out.println("\nnonstatic called nonstatic");
    }
    public void staticCalledNonstatic()
    {
        System.out.println("static called nonstatic");
    }
    public void nonstaticCall()
    {
        nonstaticCalledNonstatic();//also a non-static func can call another non-static func by using an object but not <class_name>
        nonstaticCalledStatic();//also a non-static func can call a static func by using an object as well as <class_name>
    }
    
    
    public static void staticCall()
    {
        staticCalledStatic();//also a static func can call another static func by using an object as well as <class_name>
        new FuncCalls().staticCalledNonstatic();//the only way a static func can call a non-static func is by using an object
    }
    public static void staticCalledStatic()
    {
        System.out.println("\nstatic called static");
    }
    public static void nonstaticCalledStatic()
    {
        System.out.println("nonstatic called static");
    }
}//Therefore, a non-static func cant b called by using <class_name> but a static func can b called by all the 3 ways