/**
 * @project book-java-interview
 * @package page130
 * @file Test.java
 * @author chenxihong
 */
package page130;

/** 
 * Class: Test
 * date: 2017年7月18日 下午9:03:23
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	public static void main(String[] args) {
		go(new MyBase());
	}
	
	static void go(Base b) {
		b.add(8);
	}
}

class Base {
	int i;
	
	Base() {
		add(1);
		System.out.println(i);
	}
	
	void add(int v) {
		i += v;
		System.out.println(i);
	}
	
	void print() {
		System.out.println(i);
	}
}

class MyBase extends Base {
	public MyBase() {
		add(2);
	}
	
	void add(int v) {
		i += v*2;
		System.out.println(i);
	}
}
