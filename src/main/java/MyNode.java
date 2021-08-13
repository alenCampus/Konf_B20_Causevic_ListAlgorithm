public class MyNode {
    /**
     * This class represents a structure of a Doubly Linked List
     * @author: Alen Causevic
     */

    //-- Instancevariable
    int value;
    MyNode nextPointer;
    MyNode previousPointer;

    /**
     *
     * @param: value --> represents the value at the actual Node
     * @param: nextPointer --> Pointer to the next Value from the list
     * @param: previousPointer --> Pointer to the previous Value from the list
     */


    /*
    The Pointer next and previous are currently null because
    there is no reference to the list right now:
     */

    //-- Constructor
    public MyNode(int value){
        this.value = value;
        this.nextPointer = null;
        this.previousPointer = null;
    }

    /*
    Representation: || NULL <-> value <-> NULL ||
     */


}
