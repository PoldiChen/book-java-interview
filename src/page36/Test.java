/**
 * @project book-java-interview
 * @package page36
 * @file Test.java
 * @author chenxihong
 */
package page36;

/** 
 * Class: Test
 * date: 2017年7月16日 下午10:42:54
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		int a = 0;
		a = a++ + ++a;
		
		int b = 0;
		b = ++b + b++ + b++ + b++;
		
		int c = 0;
		c = c++ + c++ + c++ + ++c;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
