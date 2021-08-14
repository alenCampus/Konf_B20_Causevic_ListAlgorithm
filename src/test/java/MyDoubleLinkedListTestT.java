import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

@DisplayName("Testing Method -> addValue")
public class MyDoubleLinkedListTestT {
    MyNode testNode;

    @Test
    @DisplayName("Testing if the root value is the first added")
    public void rootValue() {
        //Exercise Phase
        MyDoubleLinkedList l = new MyDoubleLinkedList();
        l.addValue(l,10); // root --> 10
        l.addValue(l,20); // Node --> 20
        l.addValue(l,30); // tail --> 30

        l.printList(l);
        //Verify Phase
        assertEquals("The first element of the list is 10.",l.root.value,10);
    }

    @Test
    @DisplayName("Testing the last Value of the list")
    public void tailPointerNull(){
        // Exercise Phase
       MyDoubleLinkedList list = new MyDoubleLinkedList();
       list.addValue(list,10);
       list.addValue(list,20);
       list.addValue(list,30); // Expected tailNode to be --> last Element
       MyNode tailNode = list.root;

       while (tailNode.nextPointer != null){
           tailNode = tailNode.nextPointer;
       }

       //Verify Phase
        assertEquals(tailNode.value,30);
    }
}