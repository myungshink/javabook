package chap14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack Ŭ���� : LIFO(Last in First out)
 *              Vector Ŭ������ ���� Ŭ������
 *     push(Object)   : ��ü�� stack�� ����. �߰�.
 *     Object pop()   : stack���� ��ü ����. ����. stack���� ��ü ����
 *     Object peek()  : stack���� ��ü�� ��ȸ.       
 * Queue �������̽� : FIFO (First in First out)
 *              LinkedList Ŭ������ ������.
 *     offer(Object)  : ��ü�� Queue�� ����. �߰�
 *     Object poll()  : ��ü�� Queue���� ���� ����. ����. Queue���� ����        
 *     Object peek()  : Queue���� ��ü�� ��ȸ.
 *     
 * LinkedList : Queue, List �������̽��� ��� ����.           
 */
public class StackQueueEx1 {
	public static void main(String[] args) {
		String cars[] = {"�ڹ�","JSP","HTML","������"};
		Stack<String> stack = new Stack<String>();
		for(String s : cars) stack.push(s);
		System.out.println("���ÿ� ����� ��ü�� ����:" + stack.size());
		System.out.println(stack.peek());
		System.out.println("���ÿ� ����� ��ü�� ����:" + stack.size());
		System.out.println(stack.pop());
		System.out.println("���ÿ� ����� ��ü�� ����:" + stack.size());
		Queue<String> queue = new LinkedList<String>();
		for(String s : cars) queue.offer(s);
		System.out.println("ť�� ����� ��ü�� ����:" + queue.size());
		System.out.println(queue.peek());
		System.out.println("ť�� ����� ��ü�� ����:" + queue.size());
		System.out.println(queue.poll());
		System.out.println("ť�� ����� ��ü�� ����:" + queue.size());
	}
}