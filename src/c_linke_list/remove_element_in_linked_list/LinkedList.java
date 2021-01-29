package c_linke_list.remove_element_in_linked_list;

/**
 * ClassName LinkedList
 * Description TODO 类描述
 *
 * @author ZhangRenjie
 * Date  2021/1/29 21:23
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

    /**
     * Description //TODO 获得链表的第 index 个位置的元素 在链表中不是一个常用的操作，练习用
     * @param index /
     * @return E /
     * @author ZhangRenJie
     * @date 2021/1/29 21:22
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Illegal index.");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    /**
     * Description //TODO 获得链表的第一个元素
     * @return E /
     * @author ZhangRenJie
     * @date 2021/1/29 21:20
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * Description //TODO 获得链表的最后一个元素
     * @return E /
     * @author ZhangRenJie
     * @date 2021/1/29 21:20
     */
    public E getList() {
        return get(size - 1);
    }

    /**
     * Description //TODO 修改链表的第index个位置的元素为 e,在链表中不是一个常用的操作，练习用
     * @param index /
     * @param e /
     * @author ZhangRenJie
     * @date 2021/1/29 21:08
     */
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Illegal index.");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    /**
     * Description //TODO 查找链表中是否有元素e
     * @return boolean /
     * @author ZhangRenJie
     * @date 2021/1/29 21:07
     */
    public boolean contains (E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Description //TODO 从链表中删除index(0-based)位置的元素, 返回删除的元素 在链表中不是一个常用的操作，练习用
     * @param index /
     * @return E /
     * @author ZhangRenJie
     * @date 2021/1/29 21:30
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Illegal index.");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size --;
        return retNode.e;
    }

    /**
     * Description //TODO 从链表中删除第一个元素, 返回删除的元素
     * @return E /
     * @author ZhangRenJie
     * @date 2021/1/29 21:29
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * Description //TODO 从链表中删除最后一个元素, 返回删除的元素
     * @return E /
     * @author ZhangRenJie
     * @date 2021/1/29 21:29
     */
    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * Description //TODO 从链表中删除元素e
     * @param e /
     * @author ZhangRenJie
     * @date 2021/1/29 21:29
     */
    public void removeElement(E e) {
        Node prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.e.equals(e)) {
                break;
            }
            prev = prev.next;
        }

        if (prev.next != null) {
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size --;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Node cur = dummyHead.next; cur != null; cur = cur.next) {
            res.append(cur + "->");
        }
        res.append("NULL");
        return res.toString();
    }
}