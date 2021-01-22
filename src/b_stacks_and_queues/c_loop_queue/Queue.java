package b_stacks_and_queues.c_loop_queue;

/**
 * ClassName Queue
 * Description TODO 类描述 自定义队列
 *
 * @author ZhangRenjie
 * Date  2021/1/19 9:40
 */
public interface Queue<E> {
    /**
     * Description //TODO 返回队列大小
     * @return int 队列大小
     * @author ZhangRenJie
     * @date 2021/1/19 9:42
     **/
    int getSize();
    /**
     * Description //TODO 队列是否为空
     * @return boolean 是否为空
     * @author ZhangRenJie
     * @date 2021/1/19 9:42
     **/
    boolean isEmpty();
    /**
     * Description //TODO 入队——队末添加一个元素
     * @param e 入队的元素
     * @date 2021/1/19 9:42
     **/
    void enqueue(E e);
    /**
     * Description //TODO 出队-移除并返回队首元素
     * @return E 队首元素
     * @author ZhangRenJie
     * @date 2021/1/19 9:44
     **/
    E dequeue();
    /**
     * Description //TODO 查看队首元素
     * @return E 队首元素
     * @author ZhangRenJie
     * @date 2021/1/19 9:44
     **/
    E getFront();
}