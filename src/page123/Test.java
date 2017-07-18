/**
 * @project book-java-interview
 * @package page123
 * @file Test.java
 * @author chenxihong
 */
package page123;

/** 
 * Class: Test
 * date: 2017��7��18�� ����8:40:33
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Father father = new Father();
		Father child = new Child(); // ����Father��ľ�̬����
		System.out.println(father.getName()); // father
		System.out.println(child.getName()); // father
	}

}

class Father {
	public static String getName() {
		return "father";
	}
}

class Child extends Father {
	public static String getName() {
		return "child";
	}
}
