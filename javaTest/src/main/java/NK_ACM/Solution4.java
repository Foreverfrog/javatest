package NK_ACM;
/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
 */
/**
 * 标答
 *  public void push(int node) {
 *         stack1.push(node);
 *     }
 *
 *     public int pop() {
 *         if(stack1.empty()&&stack2.empty()){
 *             throw new RuntimeException("Queue is empty!");
 *         }
 *         if(stack2.empty()){
 *             while(!stack1.empty()){
 *                 stack2.push(stack1.pop());
 *             }
 *         }
 *         return stack2.pop();
 *     }
 */

import java.util.Stack;

public class Solution4 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int pop=stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return pop;
    }

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        solution4.push(1);
        solution4.push(2);
        solution4.push(3);
        System.out.println(solution4.pop());
        System.out.println(solution4.pop());
        solution4.push(4);
        System.out.println(solution4.pop());
        solution4.push(5);
        System.out.println(solution4.pop());
        System.out.println(solution4.pop());
    }
}