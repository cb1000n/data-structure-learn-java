package a_array.b_my_array;

public class Main {
    public static void main(String[] args) {
        Array array1 = new Array(20);
        System.out.println(array1.getCapacity());
        System.out.println(array1.getSize());
        System.out.println(array1.isEmpty());
        Array array2 = new Array();
        System.out.println(array2.getCapacity());
        System.out.println(array2.getSize());
        System.out.println(array2.isEmpty());
    }
}
