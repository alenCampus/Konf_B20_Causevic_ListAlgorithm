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


    // + New Method
    // Branch -> addingMethod
    public void printListReversed (MyDoubleLinkedList list){
    /*
    Explanation
    - Here the list gets printed out but in the opposite direction.
    - Means, that the first Element in the List has to be the last Element from the list
    -- Before: | NULL <-> 10 <-> 20 <-> 30 <-> NULL |
    -- After : | NULL <-> 30 <-> 20 <-> 10 <-> NULL |
    - To be able to do that , a new Node has to be created with a reference to the starting point of the list. [root]
       The new Node will be changing his position (reference) everytime the pointer comes to an end. [ value <-> NULL]
     */
        MyNode tailNode = list.root;   // Creating a new Node referenced to first Node
        if (list == null){
            System.out.println("The list ist empty!");
        }else {

                while (tailNode.nextPointer != null){ // checking if the pointer from the new Node has a value
                        tailNode = tailNode.nextPointer;  // -> move the new Node to the next Position of the list and check again.
                }

            //Printing the values from the new reference Node --> tailNode.value
            if(tailNode.nextPointer == null){
                    System.out.print("Printing List Reversed: | NULL <-> ");
                    while (tailNode.previousPointer != null){
                        System.out.print(tailNode.value +" <-> ");
                        tailNode = tailNode.previousPointer; //
                    }
                    /*
                    - Because the condition is true that the Previous Pointer from tailNode is null then
                      the last Value of the list will not get printed out.
                    - That`s why the last value has to be printed out specifically
                     */
                System.out.println(tailNode.value + " <-> NULL"); // the Last of the new Node --> 10
                }
        }
        System.out.println("-".repeat(10));
    }


    // new Method - print Reversed List
    public void printReversedList (MyDoubleLinkedList list){
    /*
    The Method "printReversedList" prints the Values of the list but in the opposite direction.
    - The first value is going to ne at the last Position of the list.
    - The last Value is going to be at the first position of the list.
     */
        MyNode printNodeReversed = list.root;

        if(list == null){
            System.out.println("The list is empty!");
        }else {
            /*
            First we have to travel to the last Node of the list.
            - The while loop helps us to change the position of our
              new created Node.
              It changes the position until the next Pointer does not have a value. [NULL]
              This time we go forward with our Node.
             */
            while (printNodeReversed.nextPointer != null){
                printNodeReversed = printNodeReversed.nextPointer;
            }
            if(printNodeReversed.nextPointer == null){
                System.out.print("Doubly Linked List Reversed: |NULL <-> ");
                /*
                Now the second while-loop is traversing through the last but backwards.
                - Changing the position of the new Node but backwards.
                 */
                while (printNodeReversed.previousPointer != null){
                    System.out.print(printNodeReversed.value + " <-> ");
                    printNodeReversed = printNodeReversed.previousPointer;
                }
                System.out.println(list.root.value + " <-> NULL|");
            }
            System.out.println("-".repeat(10));
        }
    }

}
