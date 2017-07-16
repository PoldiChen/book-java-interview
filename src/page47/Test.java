/**
 * @project book-java-interview
 * @package page47
 * @file Test.java
 * @author chenxihong
 */
package page47;

/** 
 * Class: Test
 * date: 2017年7月16日 下午10:52:28
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		int num = 100;
		num = num >> 32;
		System.out.println(num); // 结果还是100，int型位移的位数先对32求余，long型对64求余
	}

}
