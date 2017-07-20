/**
 * @project book-java-interview
 * @package page185
 * @file Test.java
 * @author chenxihong
 */
package page185;

/** 
 * Class: Test
 * date: 2017年7月20日 下午8:15:41
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operate(a, b);
		System.out.println(a + " " + b); // AB B
	}
	
	private static void operate(StringBuffer a, StringBuffer b) {
		a.append(b);
		b = a;
	}

}
