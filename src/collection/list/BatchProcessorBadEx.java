package collection.list;

public class BatchProcessorBadEx {
    private final MyArrayList<Integer> list = new MyArrayList<>();
//    private final MyLinkedList<Integer> list = new MyLinkedList<>();

    public void logic(int size) {
        for (int i = 0; i < size; i++) {
            list.add(0, i); //앞에 추가
        }
    }
}
