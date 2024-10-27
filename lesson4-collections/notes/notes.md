# Lists :

A `List` is an interface that behaves very similarly to an array 

- orderd collection (sequence)
- user can access items by index
- user can search by looping over items
- user can define where each item is inserted

## ArrayList :

ArrayList is a class that implements the interface List simply a wrapper around an array 

- add(element) : append element at the end of the list
- add(index, element) : add  element add specified index
- get(index) : return element at this index
- contains(object) : check if the element exist in the list
- remove(index) : remove element at specified index
- clear() : clear all elements
- size() : return number of elements in the list

### Creation syntax :

`ArrayList name = new ArrayList(); `  // we dont specify a type of list so we always need to cast items returned or accessed from it

# Stack :

LIFO ds (last in first out)

- push(item) : add an item onto top of stack 
- pop() : remove the object at top and returns it 
- peek() : retunrs the top object without removing
- emtpy() : checks  for emptiness of stack
- search(Object o) : search for an object in the stack and returns its posititon
- indexOf(object)

&nbsp;

#  Queue :

FIFO ds (first in first out) 

Queue is a in an inteface only and not a class by itself however defines 2 important methods for all classes that do implement queue  
add(element) & poll() 

## Deque : 

a special type of queues that includes others methods besides the basic two 

- addFirst(element) : inserts specified element at the front of deque 
- addLast(element) : inserts sepcified element at the end of this deque
- pollFirst() : retrieves and removes the first element of this deque
- pollLast() : retrieves and removes the last element of this deque 

## LinkedList :

another class that implements the queue inteface 

# Generics :

enable classes to work with mulitple data types defined at the time of instatiation of an object from it <Type>  
They eliminate the need for casting when dealing with collections in java code

&nbsp;

# Collections and polymorphism :

using the ablity to pass a parent type (parameter) an argument of the child classes that inherit (extends) from parent makes it possible to create Collections with generic type of the parent then store types of childs without problem

# HashMaps :

another collections type more fast than ArrayList in seaching

key , value pairs (key has to be unique)
