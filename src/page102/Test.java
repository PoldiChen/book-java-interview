/**
 * @project book-java-interview
 * @package page102
 * @file Test.java
 * @author chenxihong
 */
package page102;

/** 
 * Class: Test
 * date: 2017��7��18�� ����8:23:27
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	static class One {
		private static class Two {
			public static void main(String[] args) {
				System.out.println("two"); // ����ͨ�������two
			}
		}
	}

}
