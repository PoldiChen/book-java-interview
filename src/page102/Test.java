/**
 * @project book-java-interview
 * @package page102
 * @file Test.java
 * @author chenxihong
 */
package page102;

/** 
 * Class: Test
 * date: 2017年7月18日 下午8:23:27
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	static class One {
		private static class Two {
			public static void main(String[] args) {
				System.out.println("two"); // 编译通过，输出two
			}
		}
	}

}
