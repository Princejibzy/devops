/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Linked List");
		Node head;
		Node num1 = new Node ("90");
		head = num1;
	//	System.out.println(head.getData());
		Node num2 = new Node ("34");
		num2.setNextNode(head);
		head = num2;
	//	System.out.println(head.getData() +" -> " + head.getNextNode().getData());
		Node num3 = new Node ("23");
		num3.setNextNode(head);
		head = num3;
		// NEW NODES IN THE LIST
		Node num7 = new Node( "15");
		num7.setNextNode(head);
		head = num7;
		//Another node for the list!
		Node num9 = new Node("38");
		num9.setNextNode(head);
		head = num9;

		System.out.println(head.getData() +" -> " + head.getNextNode().getData() +" -> " + head.getNextNode().getNextNode().getData());
	}
}
