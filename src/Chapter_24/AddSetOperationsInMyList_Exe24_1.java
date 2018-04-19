package Chapter_24;

/** 24.1 (Add set operations in MyList) Define the following methods in MyList and
 implement them in MyAbstractList:

 public boolean addAll(MyList<E> otherList);

 public boolean removeAll(MyList<E> otherList);

 public boolean retainAll(MyList<E> otherList);

 Write a test program that creates two MyArrayLists, list1 and list2, with
 the initial values {"Tom", "George", "Peter", "Jean", "Jane"} and
 {"Tom", "George", "Michael", "Michelle", "Daniel"}, then perform
 the following operations:
 ■ Invokes list1.addAll(list2), and displays list1 and list2.
 ■ Recreates list1 and list2 with the same initial values, invokes
 list1.removeAll(list2), and displays list1 and list2.
 ■ Recreates list1 and list2 with the same initial values, invokes
 list1.retainAll(list2), and displays list1 and list2.
 */

public class AddSetOperationsInMyList_Exe24_1 {
    /** Main method */
    public static void main(String[] args) {
        String[] strings1 = {"Tom", "George", "Peter", " Jean", "Jane"};
        MyArrayList<String> list1 = new MyArrayList<>(strings1);

        String[] strings2 = {"Tom", "George", "Michael", "Michelle", "Daniel"};
        MyArrayList<String> list2 = new MyArrayList<>(strings2);

        list1.addAll(list2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println();

        list1 = new MyArrayList<>(strings1);
        list1.removeAll(list2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println();

        list1 = new MyArrayList<>(strings1);
        list1.retainAll(list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
