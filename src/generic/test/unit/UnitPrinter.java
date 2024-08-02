package generic.test.unit;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle1) {
        T unit = shuttle1.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle1) {
        BioUnit unit = shuttle1.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
