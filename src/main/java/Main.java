public class Main {

    public static void main(String[] args) {
        /*
        The List has to be first of all created by creating an object called "myList".
        After that the methods from the Class "MyDoubleLinkedList.class" is used to add
        or print the values from the List.
         */

        // Implementing a DoublyLinkedList
    MyDoubleLinkedList myList = new MyDoubleLinkedList();


    // Adding Value(s) to our List
    myList.addValue(myList,10);
    myList.addValue(myList,20);
    myList.addValue(myList,25);
    myList.addValue(myList,30);
    //----------------------------

        //-- Printing the List
    myList.printList(myList);
    //-------

        //-- Analyse the List
    myList.analyseList(myList);

    //-- Printing List Reversed
        myList.printListReversed(myList);

    //-- Printing the List but backwards
        myList.printReversedList(myList);

    //-- Deleting a value from the List
    myList.remove(myList,30);
    myList.printList(myList);
    }
}
