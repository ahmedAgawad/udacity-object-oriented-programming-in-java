# Objects & Classes :

## Strings :

strings are classes simply with powerful methods

## Wrapping primitives :

Java includes classes that wrap around primitive type to offer some extra functionality through their methods

| Class | Primitive Type |
| --- | --- |
| Integer | int |
| Long | long |
| Double | double |
| Character | char |
| String | char\[\] |

Each of those classes is made up of the corresponding primitive type as its field but usually also comes with some powerful methods

# Constructors :

## Default :

no parameters at all optional java will create default one if you dont provide any constructor  
you should create one to initialize variables to default values

## Parameterized constructor :

with parameters to set fields --> if provided java will not provide default itself

## Accessing constructors :

instead . operator you should use new keyword to access constructor and create objects from classes

### Null :

indicate no initialized object (uninitialized) if you try to access null objects it will result in runtime error

# Self - reference :

this keyword refers to the current object from which the method is being called

# Fields (public vs private) :

strongly recommeded to label all fields as private and helper methods as private also 

## Public classes :

Classes themselves can be labeled as public or private and even though you are allowed to label a class as private. --> nested classes 

## What if you don't use any label at all ?

if you don't specify acces modifier it will be labeled to package public