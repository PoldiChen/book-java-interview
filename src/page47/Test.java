/**
 * @project book-java-interview
 * @package page47
 * @file Test.java
 * @author chenxihong
 */
package page47;

/** 
 * Class: Test
 * date: 2017��7��16�� ����10:52:28
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		int num = 100;
		num = num >> 32;
		System.out.println(num); // �������100��int��λ�Ƶ�λ���ȶ�32���࣬long�Ͷ�64����
	}

}
