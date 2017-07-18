/**
 * @project book-java-interview
 * @package page063
 * @file Test.java
 * @author chenxihong
 */
package page063;

/** 
 * Class: Test
 * date: 2017��7��18�� ����8:07:36
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	private static void test(StringBuilder sb) { // �������ã��޸�������ָ��ĵ�ַ��ֵ
		sb.append(" world");
	}
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		test(sb);
		System.out.println(sb); // hello world
	}

}
