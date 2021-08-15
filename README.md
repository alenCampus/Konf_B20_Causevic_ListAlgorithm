# Konf_B20_Causevic_ListAlgorithm

## Author
- Alen Causevic

## Introduction 
    The branch is creating a new Java class which is going to thes the Method --> addValue. 
    The new Java class is called "MyDoubleLinkedListTestT".

## JUnit Test cases
 - the class "MyDoubleLinkedListTestT" is testing followinf Methods 


    - rootValue
    - tailPointerNull

 > rootValue
 The JUnit test is seperated in two halfs . 
 1. Exercise Phase

    1.1  Here a new Doubly Linked List gets implemented. 
    1.2 The list usses the "addvalue" method to insert values in to the list. 
 1. Verify Phase

    2.1 assert that the first is true. 
  ```Java
@Test
@DisplayName("Testing the root value if added")
public void rootValue(){
    // Exercise Phase 
    MyDoublyLinkedList l = new MyDoublyLinkedList();
    l.addValue(list, int value);
    
    // Verity Phase 
    assertEquals();
}
```

> tailPointerNull
This JUnit is seperated in two halfs. 
1. Exercise Phase

    1.1  Here a new Doubly Linked List gets implemented. 
    1.2 The list usses the "addvalue" method to insert values in to the list.

    1.3 Note , that the last value 30 and is also the new tail Node.
 1. Verify Phase

    2.1 Verifiying if the last value is the las value add with a new refference Node. 

  ```Java
@Test
@DisplayName("Testing the last value.")
public void tailPointerNull(){
    // Exercise Phase 
    MyDoublyLinkedList l = new MyDoublyLinkedList();
    l.addValue(list, int value);
    l.addValue(list, int valueTail); // last value
    
    // Verity Phase 
    assertEquals();
}
```

