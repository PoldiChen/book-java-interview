/**
 * @project book-java-interview
 * @package page125
 * @file Test.java
 * @author chenxihong
 */
package page125;

/** 
 * Class: Test
 * date: 2017��7��18�� ����8:51:15
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test extends Base {
	Test() {
		super(); // super���������ǰ
		System.out.println("test");
	}
}

class Base {
	Base() {
		System.out.println("base");
	}
}
