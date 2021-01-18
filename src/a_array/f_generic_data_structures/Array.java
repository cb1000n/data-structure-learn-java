package a_array.f_generic_data_structures;

public class Array<E> {
    private E[] data;
    private int size;

    /**
     * 构造函数，根据传入容量 capacity，构造数组
     * @param capacity
     */
    public Array(int capacity) {
        data = (E[])new Object[capacity];
        size = 0;
    }

    /**
     * 无参构造函数，默认数组容量 capacity 为10
     */
    public Array() {
        this(10);
    }

    /**
     * 获得数组容量 capacity
     * @return int 容量 capacity
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     * 获取数组中元素的个数
     * @return int 元素个数
     */
    public int getSize(){
        return size;
    }

    /**
     * 返回数组是否为空
     * @return boolean
     */
    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int index, E e){
        if (size == data.length){
            throw new IllegalArgumentException("Add failed. Array si full.");
        }
        if (index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size ++;
    }
}
