package b_stacks_and_queues.a_array_stack;

/**
 * ClassName ArrayStack
 * Description TODO 类描述 数组实现栈
 *
 * @author ZhangRenjie
 * Date  2021/1/18 22:41
 */
public class ArrayStack<E> implements Stack<E> {

    private Array<E> array;

    /**
     * Description //TODO 构造方法，新建一个指定大小的数组
     * @param capacity 数组大小
     * @author ZhangRenJie
     * @date 2021/1/19 7:56
     **/
    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    /**
     * Description //TODO 构造方法，新建一个默认大小的数组
     * @author ZhangRenJie
     * @date 2021/1/19 7:59
     **/
    public ArrayStack() {
        array = new Array<>();
    }

    /**
     * Description //TODO 查看栈大小
     *
     * @return int 栈大小
     * @author ZhangRenJie
     * @date 2021/1/18 22:39
     **/
    @Override
    public int getSize() {
        return array.getSize();
    }

    /**
     * Description //TODO 查看栈是否为空
     *
     * @return boolean 是否为空
     * @author ZhangRenJie
     * @date 2021/1/18 22:39
     **/
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /**
     * Description //TODO 向栈顶存入一个元素-入栈
     *
     * @param e 想要存入的元素
     * @author ZhangRenJie
     * @date 2021/1/18 22:40
     **/
    @Override
    public void push(E e) {
        array.addLast(e);
    }

    /**
     * Description //TODO 取出并删除栈顶元素-出栈
     *
     * @return E 栈顶元素
     * @author ZhangRenJie
     * @date 2021/1/18 22:40
     **/
    @Override
    public E pop() {
        return array.removeLast();
    }

    /**
     * Description //TODO 查看栈顶元素，但不删除
     *
     * @return E 栈顶元素
     * @author ZhangRenJie
     * @date 2021/1/18 22:41
     **/
    @Override
    public E peek() {
        return array.getLast();
    }

    /**
     * 查看数组容量
     * @return 容量
     */
    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: [");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() -1) {
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();
    }
}