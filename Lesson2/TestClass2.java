package javaRepeat.Lesson2;

public class TestClass2 {
    public static void main(String[] args) {
        testMyList();
        testMyLinkedList();
    }

    public static void testMyList() {
        MyList<Integer> arrayList = new MyArrayList<>();
        for (int i = 0; i < 15; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        arrayList.add(15, 100);
        System.out.println(arrayList.get(5));

        arrayList.set(5, 16);

        System.out.println(arrayList.get(5));

        arrayList.remove(5);

        System.out.println(arrayList);
    }

    private static void testMyLinkedList() {
        MyList<Integer> linkedList = new MyLinkedList<>();
        for (int i = 0; i < 15; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);

        linkedList.add(15, 100);
        System.out.println(linkedList.get(5));

        linkedList.set(5, 16);

        System.out.println(linkedList.get(5));

        linkedList.remove(5);

        System.out.println(linkedList);

        System.out.println(linkedList.indexOf(90));
    }
}
