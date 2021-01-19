package b_stacks_and_queues.b_array_queue;

/**
 * ClassName ArrayQueue
 * Description TODO 类描述
 *
 * @author ZhangRenjie
 * Date  2021/1/19 9:45
 */
public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;

    /**
     * Description //TODO 构造方法，创建指定大小的队列
     * @param capacity 队列大小
     * @author ZhangRenJie
     * @date 2021/1/19 9:49
     **/
    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    /**
     * Description //TODO 构造方法，创建默认大小的队列
     * @author ZhangRenJie
     * @date 2021/1/19 9:50
     **/
    public ArrayQueue() {
        array = new Array<>();
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
        return array.getSize();
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
        return array.isEmpty();
    }

    /**
     * Description //TODO 入队——队末添加一个元素
     *
     * @param e 入队的元素
     * @date 2021/1/19 9:42
     **/
    @Override
    public void enqueue(E e) {
        array.addLast(e);
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
        return array.removeFirst();
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
        return array.getFirst();
    }

    /**
     * Description //TODO 查看队列容量
     * @return int 队列容量
     * @author ZhangRenJie
     * @date 2021/1/19 9:52
     **/
    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: [");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1) {
                res.append(", ");
            }
            res.append("] tail");
            return res.toString();
        }
        return "ArrayQueue{}";
    }
}