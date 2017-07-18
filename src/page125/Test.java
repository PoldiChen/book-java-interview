/**
 * @project book-java-interview
 * @package page125
 * @file Test.java
 * @author chenxihong
 */
package page125;

/** 
 * Class: Test
 * date: 2017年7月18日 下午8:51:15
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test extends Base {
	Test() {
		super(); // super必须放在最前
		System.out.println("test");
	}
}

class Base {
	Base() {
		System.out.println("base");
	}
}
