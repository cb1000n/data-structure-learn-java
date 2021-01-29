package c_linke_list.a_linked_list_basics;

/**
 * ClassName LinkedList
 * Description TODO 类描述：链表的基础，Node 为节点
 *
 * @author ZhangRenjie
 * Date  2021/1/29 19:38
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


}