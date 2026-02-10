//package queue;
//
//import java.util.Arrays;
//
//public class QueueDriver {
//
//	public static void main(String[] args) {
//		
//		ArrayQueue<Integer> aq = new ArrayQueue<Integer>();
//
//		aq.add(10);
//		aq.add(20);
//		aq.add(30);
//		System.out.println(aq);
//
//		aq.offer(40);//use for insert
//		System.out.println(aq);
//
//		System.out.println("peek " + aq.peek());
//		System.out.println("element " + aq.element());
//		
////		System.out.println("remove elemnet "+aq.remove());
////		System.out.println("queue after remove "+aq);
////		
////		System.out.println("polled element "+aq.poll());
////		System.out.println("queue after polled "+aq);
//		
//		
//		System.out.println("is queue empty "+aq.isEmpty());
//		System.out.println("current size "+ aq.size());
//		
//		
//		aq.add(50);
//		aq.add(60);
//		System.out.println("queue "+aq);
//		System.out.println("contains 50? "+aq.contains(50));
//		System.out.println("contains 100? "+aq.contains(100));
//		
//		
//		ArrayQueue<Integer> aq2 = new ArrayQueue<Integer>();
//		aq2.add(30);
//		aq2.add(40);
//		aq2.add(60);
//		
//		System.out.println("queue aq "+aq);
//		System.out.println("queue aq2 "+aq2);
//		System.out.println("aq euals aq2 "+aq.equals(aq2));
//		
//		System.out.println("before shuffle "+aq);
//		aq.shuffle();
//		System.out.println("after shuffle "+aq);
//		
//		
//	}
//}
