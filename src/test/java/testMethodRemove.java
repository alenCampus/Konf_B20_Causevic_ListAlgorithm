import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

@DisplayName("Testing Method -> remove")

public class testMethodRemove {
    @Test
    @DisplayName("Testing if the root value is correctly changed")
    public void checkRootPositon(){
        //Exercise Phase
        MyDoubleLinkedList list = new MyDoubleLinkedList();
        list.addValue(list,10); //root
        list.addValue(list,20); //Node
        list.addValue(list,30); //Tail

        list.remove(list,10);
        // After deleting 20 should be the new root positon
        // 20 Root
        // 30 Tail
        assertEquals("Root removed and changed positon.",list.root.value,20);
    }

    @Test
    @DisplayName("Testing if the Tail postion is changed after deleting the last value.")
    public void checkTailPosition(){
        MyDoubleLinkedList list = new MyDoubleLinkedList();
        list.addValue(list,10); //root
        list.addValue(list,20);
        list.addValue(list,30);
        list.addValue(list,40); // tail

        list.remove(list,40);
        MyNode check = list.root;
        while (check.nextPointer != null){
            check = check.nextPointer;
        }
        assertEquals("New Tail position = 30.",check.value,30);
    }
}
