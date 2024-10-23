# Input scanner :

to take user inputs we use scanner object for this functionality   
`Scanner scanner = new Scanner(System.in);` 

System.in is basically the command line   
the scanner will contiune to read until the user hit enter

Scanners can be used to read Strings , Integer or an entire line   
`scannerObj.nextLine() `  return everything the user has typed in before they hit "enter"

# File Scanner :

another way of accepting the user input is through files can done by using File object and Scanner object 

```java
File file = new File("path");
Scanner scanner = new Scanner(file);

while(scanner.hasNextLine()) {
   String line = scanner.nextLine();
}
```

# Expections :

used to be thrown when a runtime error occurs 

functions that may throws an expections should contain `throws (expectionType)` at the end of method signature and should be run inside try catch blocks to catch and handle thrown expections

Inside the catch block you might also throw the expection again 

you can also have multiple catch blocks for the same try block to handle different types of thrown expections  
Another option is to catch all expections using the generic type Exception in the catch block