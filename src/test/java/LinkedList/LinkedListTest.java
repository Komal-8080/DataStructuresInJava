package LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
	
	
	@Test
	public void given3NumbersWhenLinkedShouldPassLinkedListTest() {
		LinkedList<Integer> myFirstNode = new LinkedList<>(56);
		LinkedList<Integer> mySecondNode = new LinkedList<>(30);
		LinkedList<Integer> myThirdNode = new LinkedList<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) &&
				mySecondNode.getNext().equals(myThirdNode);
				Assert.assertTrue(result);
	}
}
