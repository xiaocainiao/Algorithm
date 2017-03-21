package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by liangnan on 17/3/18.
 */
public class printListFromTail {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;


        System.out.println(solution(a).toString());
        System.out.println("===============");
        System.out.println(solution_iter(a).toString());
    }

    public static ArrayList<Integer> solution(ListNode listNode){
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }


        while(!stack.isEmpty()){
            arr.add(stack.pop());
        }

        return arr;
    }
    private static ArrayList<Integer> arrlist = new ArrayList<>();
    public static ArrayList<Integer> solution_iter(ListNode listNode){

        if(listNode != null){
            solution_iter(listNode.next);
            arrlist.add(listNode.val);
        }
        return arrlist;
    }

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
