package oop_02_23;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionEx {
	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(iterator.hasNext()? "->" : "\n");
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머"); myList.add("스타워즈");
		myList.add("매트릭스"); myList.addFirst("터미네이터");
		myList.add(2,"아바타");
		
		Collections.sort(myList);
		printList(myList); //매트릭스->스타워즈->아바타->터미네이터->트랜스포머
		Collections.reverse(myList); //트랜스포머->터미네이터->아바타->스타워즈->매트릭스
		printList(myList);
		
		int index = Collections.binarySearch(myList, "아바타") + 1;
		System.out.println("아바타는 " + index + "번째 요소입니다.");//아바타는 3번째 요소입니다.
		}

}
