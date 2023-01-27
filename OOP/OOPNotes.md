# **About OOP**

**OOP** stands for **Object-Oriented Programming**.

OOP has several advantages over procedural programming:

- it's faster & easier to execute;
- provides a clear structure for the programs;
- keeps the code DRY ("Don't Repeat Yourself");
- makes the code easier to maintain, modify and debug;
- makes it possible to create fully reusable applications with less code & shorter development time.

## **Components**

The two main components of OOP are: **objects** & **classes**.

Objects are an instance of the class. They inherit all the variables & methods from the class.

Classes are a template or a blueprint for the object. Classes have attributes and methods.

### **Attributes**

- are variables within a class;
- can be accessed by creating an object of the class and using the dot syntax '.';
- can also be modified by the assignment operator '=';
- can be locked, so they cannot be modified by declaring them as 'final' with the 'final' keyword;
- can have multiple values for each created object.

### **Methods**

- are a block of code that runs only when it's called;
- can take parameters;
- are useful to reuse code, by defining it once;
- are used to perform a certain action related to the class;
- can be accessed with an object with the dot syntax '.'.

### **Modifiers**

There are two type of modifiers: _access modifiers_ & _non-access modifiers_. These can also be divided by _classes & attributes_, _methods & constructors_.

_Access modifiers for classes_:

- public - the class is accessible by any other class;
- default - the class is only accessible by classes in the same package.

_Access modifiers for attributes, methods and constructors_:

- public - the code is accessible for all classes;
- private - the code is only accessible within the declared class;
- protected - the code is accessible in the same package and subclasses;
- default - the code is only accessible in the same package.

_Non-access modifiers for classes_:

- final - the class cannot be inherited by other classes;
- abstract - the class cannot be used to create objects.

_Non-access modifiers for attributes, methods_:

- final - attributes and methods cannot be overridden or modified;
- static - attributes and methods belong to the class, rather than the object;
- abstract - only for methods and can only be used in abstract classes;
- transient - attributes and methods are skipped when serializing the object containing them;
- synchronized - methods can only be accessed by one thread at a time;
- volatile - the value of an attribute is not cached thread-locally, and is always read from the main memory.

### **Constructors**

Special method used to initialize object. The constructor is called when an object of a class is created.

**NOTE**: Constructor name must match the class name, and it cannot have a return type.

## **Concepts**

**OOP** has four principles/concepts used to simplify development and maintenance:

### **Inheritance**

- The main idea behind inheritance is that you can create new classes based on existing classes.
- When inheriting from an existing class, attributes and methods from the parent class can be reused.
- The concept can be grouped into two categories: _subclass(child)_ - the class that inherits from another class & _superclass(parent)_ - the class being inherited from.
- Inheritance is done with the '_extends_' keyword.

### **Polymorphism**

- Occurs when we have many classes that are related to each other by inheritance.
- Uses methods inherited from the parent class to perform different tasks in the child class.

### **Encapsulation**

- Makes sure sensitive data is hidden from the users.
- It's achieved by declaring class attributes as 'private'.
- Provide public get & set methods to access and update the value of a private variable.
- Class attributes can be made read-only with the get method or write only with the set method.

### **Abstraction**

- Process of hiding certain details and showing only essential information to the users.
- This is achieved either by abstract classes or by interfaces.
