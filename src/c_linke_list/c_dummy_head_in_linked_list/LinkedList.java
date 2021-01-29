package c_linke_list.c_dummy_head_in_linked_list;

/**
 * ClassName LinkedList
 * Description TODO 类描述：设置虚拟头节点的链表，设置虚拟头，就不用判断插入位置是否是首位
 *
 * @author ZhangRenjie
 * Date  2021/1/29 20:46
 */
public class LinkedList<E> {
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = null;
        size = 0;
    }

    /**
     * Description //TODO 获取链表中的元素个数
     * @return int /
     * @author ZhangRenJie
     * @date 2021/1/29 19:57
     */
    public int getSize() {
        return size;
    }

    /**
     * Description //TODO 返回链表是否为空
     * @return boolean /
     * @author ZhangRenJie
     * @date 2021/1/29 19:58
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Description //TODO 在链表头添加新的元素 e
     * @param e /
     * @author ZhangRenJie
     * @date 2021/1/29 19:58
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * Description //TODO 在链表的 index 位置添加新的元素 e
     * @param index /
     * @param e /
     * @author ZhangRenJie
     * @date 2021/1/29 19:59
     */
    public void add(int index, E e) {
        // 判断是否超出链表范围
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        Node prev = dummyHead;
        // 便利寻找想要插入位置的元素
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        // 将元素插入到指定位置
        prev.next = new Node(e, prev.next);
        size ++;
    }

    /**
     * Description //TODO 链表末尾添加元素 e
     * @param e /
     * @author ZhangRenJie
     * @date 2021/1/29 20:06
     */
    public void addLast(E e) {
        add(size, e);
    }

}