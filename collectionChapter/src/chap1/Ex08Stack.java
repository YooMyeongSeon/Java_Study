package chap1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex08Stack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(500);
		stack.push(10);
		stack.push(50);
		stack.push(100);
		
		while (!stack.isEmpty()) { //비어있지 않다면 조건
			System.out.println(stack.pop()); //꺼내고 삭제한다.
		}
		System.out.println("------------------------------");
		Queue<Integer> que = new LinkedList<>();
		
		que.offer(500);
		que.offer(10);
		que.offer(50);
		que.offer(100);
		
		while (!que.isEmpty()) {
			System.out.println(que.poll());
		}
	}
}
