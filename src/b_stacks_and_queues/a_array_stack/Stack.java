package b_stacks_and_queues.a_array_stack;

/**
 * ClassName Stack
 * Description TODO 类描述 定义一个栈的接口
 *
 * @author ZhangRenjie
 * Date  2021/1/18 22:37
 */
public interface Stack<E> {
    /**
     * Description //TODO 查看栈大小
     * @return int 栈大小
     * @author ZhangRenJie
     * @date 2021/1/18 22:39
     **/
    int getSize();

    /**
     * Description //TODO 查看栈是否为空
     * @return boolean 是否为空
     * @author ZhangRenJie
     * @date 2021/1/18 22:39
     **/
    boolean isEmpty();

    /**
     * Description //TODO 向栈顶存入一个元素-入栈
     * @param e 想要存入的元素
     * @author ZhangRenJie
     * @date 2021/1/18 22:40
     **/
    void push(E e);

    /**
     * Description //TODO 取出并删除栈顶元素-出栈
     * @return E 栈顶元素
     * @author ZhangRenJie
     * @date 2021/1/18 22:40
     **/
    E pop();

    /**
     * Description //TODO 查看栈顶元素，但不删除
     * @return E 栈顶元素
     * @author ZhangRenJie
     * @date 2021/1/18 22:41
     **/
    E peek();
}