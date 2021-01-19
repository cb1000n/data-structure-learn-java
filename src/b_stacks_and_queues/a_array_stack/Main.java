package b_stacks_and_queues.a_array_stack;

/**
 * ClassName Main
 * Description TODO 类描述 测试自定义数组栈
 *
 * @author ZhangRenjie
 * Date  2021/1/19 8:11
 */
public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}