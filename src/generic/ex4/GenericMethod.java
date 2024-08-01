package generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj) {
        System.out.println(obj);
        return obj;
    }

    public static <T> T genericStaticMethod(T t) {
        System.out.println(t);
        return t;
    }

    public <T> T genericInstanceMethod(T t) {
        System.out.println(t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }
}
