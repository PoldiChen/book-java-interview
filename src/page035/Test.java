/**
 * @project book-java-interview
 * @package page035
 * @file Test.java
 * @author chenxihong
 */
package page035;

/** 
 * Class: Test
 * date: 2017��7��16�� ����10:22:45
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 100; i++) {
			j = j++;
		}
		System.out.println(j); // 0
	}

}
