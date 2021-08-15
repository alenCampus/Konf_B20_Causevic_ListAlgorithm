# Konf_B20_Causevic_ListAlgorithm

## Author
- Alen Causevic

## Introduction 
 Welcome to my repository. This repository was created and designed by me. Here I am going to use and explain how i implemented the Algorithm "Doubly Linked List". Before we get  started with the Code Implementation, I would like to give a small "Crashcourse"  about the differences of "Single Linked List" and "Doubly Linked List".
 
# Linked List 

Every Node at a Linked List has 2 Parts of data. 
- One which contains the value of the node.
- A Pointer that has link to the next Value of the list

The Linked List stores their values in terms of "Nodes" or also called "containers". 
Each Node contains a value and points at directly to the next Value of the upcoming Node. 

The starting point of a Node is called **root**.



# Doubly Linked List
> The alternative Verison of a Linked List 

A Doubly Linked List is just like a Linked List but in Addition the Values of the Node has a link to the previous Value.

It Conatains following values: 
- Pointer to the previous Value of the list.
- The actual Value of the Node 
- Pointer to the next Value of the list.

A Doubly Linked List knows the has a link from the previous Node and a link to next Node of the list. 

___
# Classes
- `Main`
- `MyNode`
- `MyDoubleLinkedList`

## Classes for Junit Tests ##
- `MyDoubleLinkedListTestT`
- `testMethodRemove`


# Branches
 -  Every Branch represents a new feature created in the Main or in the MyDoublyLinked List Class. These Branches will be merged with the main Branch.

> Branches -> MyDoublyLinkedList.class

These Branches initialize new Methods in "MyDoublyLinkedList.class". To be sure what kind of changes the class gets and eventually will be merged with the main-branch, the names of the class beggins with adding-Method-[name of Method]. 

- `adding-Method-printReversedList`
- `adding-Method-remove`
- `adding-Methods`

---

> Branches -> JUnit Tests

These Branches are created to change and initialize new Test-Cases for the "MyDoublyLinkedList.class". Each Branch represents a java class which tests the Methods used in "MyDOublyLinkedList.java".
Naming Conventions: test-Method-[Name of Method]
- `testMyDoublyLinkedList`
- `test-Method-remove`
___

# JavaDoc comments

- Every Method has a explenation with a "Regular multiple line comment". These comments are going to have a smal number in which the user can find out how the Method uses New Node.

```Java
public class MyDoublyLinkedList{

public void addVallue (MyDoublyLinkedList list, int value){
 /*
    Regular multiple line comment 
 */
}
}
```

```Java
public void methodName(int value){
 /*
    Explenation:  
     - [1] INDEX
     - [2] INDEX
    Representation: NULL <-> value <-> NULL
 */
}
```

___


