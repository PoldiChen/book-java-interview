/**
 * @project book-java-interview
 * @package page202
 * @file Test.java
 * @author chenxihong
 */
package page202;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/** 
 * Class: Test
 * date: 2017��7��20�� ����8:35:50
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>(10, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) { // Ĭ�ϴ�С�������У���С�����ȼ���
				int result = o1 % 2 - o2 % 2;
				if (result == 0) {
					result = o1 - o2;
				}
				return result; // �µ�ֵ����ʱ�ȸ����ȼ���ߵıȽϣ�����ֵС��0���ʾ�µ�ֵ���ȼ���
			}
		});
		for (int i = 0; i < 10; i++) {
			queue.offer(i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(queue.poll()); // 0 2 4 6 8 1 3 5 7 9
		}
	}

}
