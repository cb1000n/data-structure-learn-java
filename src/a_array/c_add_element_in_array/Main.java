package a_array.c_add_element_in_array;

public class Main {
    public static void main(String[] args) {
        Array array1 = new Array(20);
        array1.add(0, 1);
        array1.addFirst(0);
        array1.addLast(2);
        System.out.println(array1.getCapacity());
        System.out.println(array1.getSize());
        System.out.println(array1.isEmpty());
        Array array2 = new Array();
        array2.add(0, 4);
        array2.addFirst(3);
        array2.addLast(5);
        System.out.println(array2.getCapacity());
        System.out.println(array2.getSize());
        System.out.println(array2.isEmpty());
    }
}
