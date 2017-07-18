/**
 * @project book-java-interview
 * @package page063
 * @file Test.java
 * @author chenxihong
 */
package page063;

/** 
 * Class: Test
 * date: 2017年7月18日 下午8:07:36
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	private static void test(StringBuilder sb) { // 传入引用，修改了引用指向的地址的值
		sb.append(" world");
	}
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		test(sb);
		System.out.println(sb); // hello world
	}

}
