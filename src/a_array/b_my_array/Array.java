package a_array.b_my_array;

public class Array {
    private int[] data;
    private int size;

    /**
     * 传入数组的容量capacity构造Array
     * @param capacity 数组的容量
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 无参构造函数，默认数组容量为10
     */
    public Array() {
        this(10);
    }

    /**
     * 获取数组容量
     * @return int 数组容量
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 获取数组中的元素个数
     * @return int 组中的元素个数
     */
    public int getSize() {
        return size;
    }

    /**
     * 返回数组是否为空
     * @return boolean 数组是否为空
     */
    public boolean isEmpty(){
        return size == 0;
    }
}
