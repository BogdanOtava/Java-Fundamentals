# **Data Structures**

**Data Structures** are fundamental to any programming language. They are defined as a format for arranging, processing, accessing and storing data.

In **Java**, data structures are defined as the **collection** of data pieces that offer an effective way to store and organize data in a computer.

---

## **Types of Data Structures in Java**

In order to store multiple values or objects of the same type, **Java** provides two types of data structures: **Arrays** & **Collections**.

- Differences between **arrays** & **collections**:

| **Arrays**                                                | **Collections**                                                |
| --------------------------------------------------------- | -------------------------------------------------------------- |
| Fixed in size.                                            | Are growable in size.                                          |
| Size cannot be increased or decreased after it's created. | Size can be increased or decreased after it's created.         |
| Regarding memory, arrays are not recommended to use.      | Regarding memory, collections are recommended to use.          |
| Regarding performance, arrays are recommended to use.     | Regarding performance, collections are not recommended to use. |
| Can hold only homogeneous data types elements.            | Can hold both homogeneous and heterogeneous elements.          |
| Has no underlying data structure.                         | Are implemented based on some standard data structure.         |
| Can hold both objects and primitive data types.           | Can hold only object types.                                    |

---

### Arrays

- the simplest **data structure** in Java.
- **elements** inside the **array** are _ordered_.
- can also be used as a _static field_, _local variable_, or a _method parameter_.
- **size** must be specified by either **int** or **short** value.
- **size** cannot be altered once the array has been initialized.
- can be **one-dimensional** or **multi-dimensional**.

#### One-Dimensional Array

- stores a single list of elements of similar data type.

#### Multi-Dimensional Array

- stores a _list of lists_ of elements of similar data type.

---

### Collections

- any group of individual objects which are represented as a single unit is knows as the collection of the objects.
- the **collection framework** contains all collection _classes_ and _interfaces_.
- hierarchy of the **collection framework**:

![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20220526152255/Collections-in-Java1.png)

#### Iterable Interface

- the **root interface** for the entire **collection framework**.
- the **collection interface** extends the **iterable interface**.
- the main functionality is to provide an _iterator_ for the collections.
- contains only one abstract methods which is:

`Iterator iterator();`

#### Collection Interface

- extends **iterable interface** and is implemented by all the classes in the **collection framework**.
- contains all the _basic methods_ which every collection has, such as: _add_, _remove_, _clear_, _etc_.
- ensures that the names of the methods are universal for all collections.

#### List Interface

- **child interface** of the **collection interface**.
- it's dedicated to the data of the list type in which we can store all the _ordered_ collection of the objects.
- allows duplicate data in it.

**Classes which implement the _List Interface_ are:**

**1. ArrayList**

- provides _dynamic arrys_.
- slower than the standard arrays.
- **size** is _increased automatically_ if the collection increases or decreases.
- **allows** _random access_ to the list.
- **primitive types** cannot be used. **wrapper class** is needed for such cases.

**2. LinkedList**

- **linear** data structure where elements are not stored in contiguous locations and every element is a separate object with a _data part_ and _address part_.
- elements are linked using _pointers_ and _addresses_.
- each element is known as a **node**.

**3. Vector**

- provides _dynamic arrays_.
- identical to **ArrayList** in implementation.
- difference is that **Vectors** is _synchronized_, while **ArrayLists** are _non-synchronized_.

**4. Stack**

- class is based on the basic principle of _last in first out_.
- also provides three more functions of _empty_, _search_, and _peek_.
- can also be reffered to as a _subclass_ of **Vector**.

#### Queue Interface

- as the name suggests, maintains the **FIFO**(_First In First Out_) order.
- is dedicated to storing all elements where the order of the elements matter.

**Classes which implement the _Queue Interface_ are:**

**1. Priority Queue**

- used when the objects are supposed to be used based on **priority**.
- follows the **FIFO** algorithm, but sometimes the elements are needed to be processed according to the priority and this class is used in these cases.
- is based on the _priority heap_.
- elements are ordered according to the natural ordering, or by a **Comparator** provided at queue construction time.

#### Deque Interface

- also known as _double-ended queue_.
- a data structure where we can add and remove elements from both ends of the queue.
- extends the **Queue Interface**.

**Classes which implement the _Deque Interface_ are:**

**1. ArrayDeque**

- provides a way to apply **resizable array**.
- this is a special kind of array that grows and allows adding or removing elements from both side of the queue.
- they have no _capacity_ and they grow as necessary.

#### Set Interface

- a **set** is an _unordered_ collection of objects in which duplicates cannot be stored.
- used to avoid **duplication of objects** and only store **unique objects**.

**Classes which implement the _Set Interface_ are:**

**1. HashSet**

- objects inserted into a **HashSet** do not guarantee to be inserted in the same order.
- are inserted based on their **hashcode**.
- also allows insertion of **null elements**.

**2. LinkedHashSet**

- very similar to the **HashSet**.
- the difference is that it uses a _doubly linked list_ to store the data and retains the ordering of the elements.

#### Sorted Set Interface

- similar to the **Set Interface**.
- difference is that has extra methods that maintain the ordering of the elements.
- extends the **Set Interface** and is used to handle the data which needs to be sorted.

**Classes which implement the _Sorted Set Interface_ are:**

**1. Tree Set**

- uses a _Tree_ for storage.
- the ordering of the elements is maintained by a set using their natural ordering whether or not an explicit **comparator** is provided.
- can also be ordered by a **comparator** provided at set creation time.

#### Map Interface

- supports the **key-value pairing** of data.
- does not support duplicate keys because the same key cannot have multiple mappings.
- a map is useful is there is data we wish to perform operations on the basis of the key.

**Classes which implement the _Map Interface_ are:**

**1. HashMap**

- provides basic implementation of the **Map Interface**.
- stores data in **key-value pairs**.
- to access a **value**, we must know its **key**.
- uses a technique called **hashing**, which converts a large _string_ to a small _string_ that represents the same _string_ so that the indexing and search operations are faster.
- **HashMap** also uses **HashSet** internally.

**2. EnumMap**

- specialized implementation of the **Map Interface** for _enumeration types_.
- it's not **synchronized**.
- is an **ordered** collection and they are maintained in the **natural order** of their **keys**.
- **high-performance** implementation, much faster than **HashMap**.
- internally is represented as **arrays**.
- doesn't allow _null_ key.

**3. TreeMap**

- map sorted according to the **natural ordering** of its **keys**, or by a **Comparator**.
- contains only **unique** elements.
- is **non-synchronized**.
- cannot have _null_ keys, but can have multiple _null_ values.
