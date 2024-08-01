package generic.ex4;

public class Box<T> {

    // 여기서 제네릭 메서드의 T는 클래스 제네릭 타입의 T와 무관하다. V로 선언한 2메서드랑 같음
    public static <T> T genericStaticMethod(T t) {
        return t;
    }

    public static <V> V genericStaticMethod2(V v) {
        return v;
    }

    public <Z> Z genericInstanceMethod(Z z) {
        return z;
    }

    public T instanceMethod(T t) {
        return t;
    }

    //불가
//    static T staticMethod1(T t) {
//        return t;
//    }
}
