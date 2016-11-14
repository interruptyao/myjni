public class TestNative 
{
    static {
        System.out.println( " hello library:1");
        try { 
            System.loadLibrary("HelloNative"); //没有lib前缀
            System.out.println( " hello library:2");
        } 
        catch(UnsatisfiedLinkError e) { 
            System.out.println( "Cannot load hello library:\n " + e.toString() ); 
        }
        System.out.println( " hello library:3");
    }



    public static void main(String[] args) {
        System.out.println( " hello library:");
        Hellonative test = new Hellonative();
        test.sayHello();
    }
}