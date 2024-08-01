package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 1;
        Object obj = GenericMethod.objMethod(i);

        Integer integer1 = GenericMethod.<Integer>genericStaticMethod(i);
        Integer integer2 = GenericMethod.<Integer>genericStaticMethod(10);
        Double double1 = GenericMethod.<Double>genericStaticMethod(10.0);

        Integer integer3 = GenericMethod.genericStaticMethod(i);
        Integer integer4 = GenericMethod.genericStaticMethod(10);
        Double double2 = GenericMethod.genericStaticMethod(10.0);

        GenericMethod genericMethod = new GenericMethod();
        Integer integer5 = genericMethod.genericInstanceMethod(500);
    }
}
