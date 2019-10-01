package chap14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx1 {
	public static void main(String[] args) {
		String cars[] = {"자바","JSP","HTML","스프링"};
		Stack<String> stack = new Stack<String>();
		for(String s : cars) stack.push(s);
		System.out.println("스택에 저장된 객체의 갯수:" + stack.size());
		System.out.println(stack.peek());
		System.out.println("스택에 저장된 객체의 갯수:" + stack.size());
		System.out.println(stack.pop());
		System.out.println("스택에 저장된 객체의 갯수:" + stack.size());
		Queue<String> queue = new LinkedList<String>();
		for(String s : cars) queue.offer(s);
		System.out.println("큐에 저장된 객체의 갯수:" + queue.size());
		System.out.println(queue.peek());
		System.out.println("큐에 저장된 객체의 갯수:" + queue.size());
		System.out.println(queue.poll());
		System.out.println("큐에 저장된 객체의 갯수:" + queue.size());
	}
}