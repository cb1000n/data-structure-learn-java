package b_stacks_and_queues.c_loop_queue;

/**
 * ClassName LoopQueue
 * Description TODO 类描述：环形队列，队首和队尾连接
 *
 * @author ZhangRenjie
 * Date  2021/1/21 20:04
 */
public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front, tail;
    private int size;

    /**
     * 构造方法，根据传入大小生成队列
     * @param capacity 数组大小
     */
    public LoopQueue(int capacity) {
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    /**
     * 无参构造方法，生成默认大小的队列
     */
    public LoopQueue() {
        this(10);
    }

    /**
     * 返回队列容量
     * @return
     */
    public int getCapacity() {
        return data.length - 1;
    }

    /**
     * Description //TODO 返回队列大小
     *
     * @return int 队列大小
     * @author ZhangRenJie
     * @date 2021/1/19 9:42
     **/
    @Override
    public int getSize() {
        return size;
    }

    /**
     * Description //TODO 队列是否为空
     *
     * @return boolean 是否为空
     * @author ZhangRenJie
     * @date 2021/1/19 9:42
     **/
    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    /**
     * Description //TODO 入队——队末添加一个元素
     *
     * @param e 入队的元素
     * @date 2021/1/19 9:42
     **/
    @Override
    public void enqueue(E e) {
        // 判断循环队列是否存满
        if ((tail + 1) % data.length == front) {
            reSize(getCapacity() * 2);
        }
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    /**
     * Description //TODO 调整循环队列容量
     * @param newCapacity 需要的容量
     * @author ZhangRenJie
     * @date 2021/1/21 21:21
     */
    private void reSize(int newCapacity) {
        E[] newData = (E[])new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(i + front) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    /**
     * Description //TODO 出队-移除并返回队首元素
     *
     * @return E 队首元素
     * @author ZhangRenJie
     * @date 2021/1/19 9:44
     **/
    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("不能从空的队列中移除元素");
        }
        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size --;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            reSize(getCapacity() / 2);
        }
        return ret;
    }

    /**
     * Description //TODO 查看队首元素
     *
     * @return E 队首元素
     * @author ZhangRenJie
     * @date 2021/1/19 9:44
     **/
    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("不能从空的队列中移除元素");
        }
        return data[front];
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size = %d, capacity = %d\n", size, getCapacity())).append("front [");
        for (int i = front; i != tail ; i = (i + 1) % data.length) {
            res.append(data[i]);
            if ((i + 1) % data.length != tail) {
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}