public class MyDoubleLinkedList {

    /**
     * Here are all the methods implemented for creating and printing Nodes
     * @author: Alen Causevic
     * Methods:
        * - printList
        * - analyseList
        * - printListReversed
        * - addValue
        * - removeValue
     */
    //-- Instancevariable --
    /**
     * Explaining root.
     * @param root --> Root is the first Node where the "Doubly Linked List" starts to traverse
     *             --> Root is always the first value of the List.
     */
    MyNode root;

    //---------------
    // -- Constructor --
    public MyDoubleLinkedList(){
        this.root = root;
    }
    //-----------

    //-- Methods
    public MyDoubleLinkedList addValue(MyDoubleLinkedList list, int value){
        MyNode addingNode = new MyNode(value); // Here a new Node is Created with the value
        /**
         * if the first Value of the List is NULL then change the Reference
         * root to the new created Node.
         */
        if(list.root == null){
            list.root = addingNode;
        }else {
            MyNode referenceNode = list.root; // Only points to the first Value and starts from there
            while (referenceNode.nextPointer != null){
                referenceNode = referenceNode.nextPointer;
            }

            referenceNode.nextPointer = addingNode; // the new Node gets his new NEXTPOINTER
            addingNode.previousPointer = referenceNode;
        }

        return list;
    }

    public void analyseList(MyDoubleLinkedList list){
        /*
        This Method analyse and prints the Values of the List.
        It prints it's pointers and the value of the referenced Node.

         */
        MyNode printNode = list.root;
        if(printNode == null){
            System.out.println("The List has no Values");
        }else {
            System.out.println("-".repeat(10));
            System.out.println("Printing Values");
        }

        while (printNode != null){
            if(printNode.previousPointer == null && printNode.nextPointer != null){
                System.out.print("<- Root previous: " + printNode.previousPointer);
                System.out.print(" Root value: |" + printNode.value +"| ");
                System.out.println("-> Root next: " + printNode.nextPointer.value);
            }else if (printNode.previousPointer != null && printNode.nextPointer!= null){
                System.out.print("<- Node Previous: " + printNode.previousPointer.value + " ");
                System.out.print("Node Value:   |" + printNode.value +"| ");
                System.out.println("-> Node next: " + printNode.nextPointer.value);
            }else if (printNode.previousPointer != null && printNode.nextPointer == null){
                System.out.print("<- Tail Previous: " + printNode.previousPointer.value + " ");
                System.out.print("Tail Value:   |" + printNode.value +"| ");
                System.out.println("-> Tail Next: " + printNode.nextPointer);

            }
            printNode = printNode.nextPointer;
        }
        System.out.println("-".repeat(10));


    }

    public void printList(MyDoubleLinkedList list){
        /*
        The Method "printList" only prints the the List which was created and
        initialized with values

         */

        /**
         * @param printNode :  --> References to the first Node of our List [root]
         *                     --> it has it's Values and it's pointer
         */
        MyNode printNode = list.root;

        //if the reference is empty then the list is empty
        if(printNode == null){
            System.out.println("The List is empty!");
        }else {
            System.out.println("Double Linked List Printing");
            System.out.print("||NULL <-> ");
            while (printNode != null){
                System.out.print(printNode.value + " <-> ");
                printNode = printNode.nextPointer;
            }
            System.out.println("NULL||");
            System.out.println();
        }
    }

}
