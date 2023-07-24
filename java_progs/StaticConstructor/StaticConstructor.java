public class StaticConstructor
{
    static int a,b;
    public StaticConstructor(int a,int b)
    {
        a=this.a;
        b=this.b;
        System.out.println(a+", "+b);
    }
    public static void call(int x,int y)
    {
        new StaticConstructor(x,y);
        System.out.println(a+", "+b);
    }
}