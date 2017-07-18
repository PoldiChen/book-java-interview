/**
 * @project book-java-interview
 * @package page110
 * @file Test.java
 * @author chenxihong
 */
package page110;

/** 
 * Class: Test
 * date: 2017年7月18日 下午8:30:39
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test extends X {
	Y y = new Y();
	Test() {
		System.out.println("Test");
	}
	public static void main(String[] args) {
		new Test(); // Y X Y Test
	}
}

class X {
	Y y = new Y();
	X() {
		System.out.println("X");
	}
}

class Y {
	Y() {
		System.out.println("Y");
	}
}
