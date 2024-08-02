package collection.array;

public class MyArrayListMainV1 {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("a");
        System.out.println(myArrayList);
        myArrayList.add("b");
        System.out.println(myArrayList);
        myArrayList.add("c");
        System.out.println(myArrayList);

        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.indexOf("c"));
        System.out.println(myArrayList.set(2, "d"));
        System.out.println(myArrayList);

        myArrayList.add("d");
        myArrayList.add("e");

        //범위초과
        myArrayList.add("f");
    }
}
