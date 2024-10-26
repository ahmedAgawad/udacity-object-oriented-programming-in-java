# Inheritance :

child classes inherit the same methods and fields from parent and can contain other methods and fields related to them only

```java
class className extends ParentName {

}
```

&nbsp;

# Polymorphism :

same thing exits in many forms --> overriding and overloading

EX :

if Student inherit from Person then we can create a Person of type Student

```java
Person student = new Student();
```

we can also make a method parameter of type Person and pass Students and Teachers and it will works fine

# Method Overriding :

redeclaring methods inherited from parent class and modifiy their logic in the child class

# Super keyword :

if we don't want to completely overwrite inherited method from parent we can use `super.methodName();` to run the acutual parent method logic then we can add more code in the child class

you can also use super() in subclass construtor to call the parent's constructor before adding more code to the child's constructor

**NOTE :**  if child's constructor doesnot explicitly call the parents constructors using super, the java compiler automaically inserts a call to default constructor of the parent class

# Interfaces :

used to allow the mulitple inheritance concept in java programs   
intefaces are just promises for methods to be implemented by classes that implements those interfaces

```java
public class name implements interface1 [, interface2] {

}
```

## Comparable interface :

includes only 1 method (compareTo) which takes an object as input of same type and compare both objects   
return negative or positive or zero value

# Final Methods :

cannot be overriden 

&nbsp;
