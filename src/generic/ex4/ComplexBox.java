package generic.ex4;

public class ComplexBox<T> {
    private T animal;

    public void set(T t) {
        this.animal = t;
    }

    public <T> T printAndReturn(T t) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        // t.getName(); // 호출 불가 메서드는 <T> 타입이다. <T extends Animal> 타입이 아니다.

        return t;
    }

    //위 메서드와 완전 동일
    public <V> V printAndReturn2(V t) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        // t.getName(); // 호출 불가 메서드는 <T> 타입이다. <T extends Animal> 타입이 아니다.

        return t;
    }
}
