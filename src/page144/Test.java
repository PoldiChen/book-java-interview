/**
 * @project book-java-interview
 * @package page144
 * @file Stack.java
 * @author chenxihong
 */
package page144;

import java.util.Stack;

/** 
 * Class: Test
 * date: 2017年7月20日 下午8:07:05
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	static String[] months = {"january", "february", "march", "april", "may", "june", "july",
		"august", "september", "october", "november", "december"};
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < months.length; i++) {
			stack.push(months[i]);
		}
		System.out.println(stack);
		System.out.println(stack.elementAt(5));
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
	

}
