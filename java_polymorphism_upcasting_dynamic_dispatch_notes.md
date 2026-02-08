# Java Polymorphism, Upcasting, Dynamic Method Dispatch — Complete Notes

---

## 1. Class and Object (Base Concept)

- Class = Blueprint
- Object = Real thing created from blueprint

But with inheritance:

If class B extends class A:

When B object is created → It contains:
- A properties
- B properties

So object of child class automatically contains parent class data.

---

## 2. Inheritance Example

```java
class A {
    void show() {
        System.out.println("A show");
    }
}

class B extends A {
    void display() {
        System.out.println("B display");
    }
}
```

---

## 3. Upcasting

### Definition
Storing child object inside parent reference.

```java
A obj = new B();
```

### Meaning
- Object created = B
- Reference type = A

---

## 4. Memory Understanding

### Stack
Reference stored:

```
obj → type A
```

### Heap
Actual object stored:

```
B Object
  + A part
  + B part
```

---

## 5. What Can Be Accessed?

```java
A obj = new B();
```

Can access:
- Methods in A
- Overridden methods from B

Cannot access directly:
- Methods only in B

---

## 6. Dynamic Method Dispatch

### Definition
Method call decided at runtime based on object type.

### Example

```java
class A {
    void show() {
        System.out.println("A show");
    }
}

class B extends A {
    void show() {
        System.out.println("B show");
    }
}
```

### Main

```java
A obj = new B();
obj.show();
```

### Output
```
B show
```

Because runtime checks object type (B).

---

## 7. Compile Time vs Runtime

### Compile Time
Checks reference type.

Decides:
- Which methods can be called.

### Runtime
Checks object type.

Decides:
- Which method actually executes.

---

## 8. Downcasting

```java
B obj2 = (B) obj;
obj2.display();
```

Runtime checks if object really B.
If not → ClassCastException.

---

## 9. Why Not Just Create Parent Object?

### Example

```java
A obj = new A();
```

Always gives A behavior.

But:

```java
A obj = new B();
```

Allows specialized behavior using overriding.

---

## 10. Real World Example — Payment System

### Parent Class

```java
class Payment {
    void pay() {
        System.out.println("Generic Payment");
    }
}
```

### Child Classes

```java
class UpiPayment extends Payment {
    void pay() {
        System.out.println("UPI Payment");
    }
}

class CardPayment extends Payment {
    void pay() {
        System.out.println("Card Payment");
    }
}
```

---

## 11. Polymorphism Usage

```java
Payment p;

p = new UpiPayment();
p.pay();

p = new CardPayment();
p.pay();
```

Output:
```
UPI Payment
Card Payment
```

---

## 12. Why Not Use Child Reference Always?

This works:

```java
UpiPayment u = new UpiPayment();
```

But not flexible.

If new payment types added → Code must change everywhere.

---

## 13. Real Power — Runtime Decision

```java
Payment p;

if(choice == 1)
    p = new UpiPayment();
else
    p = new CardPayment();

p.pay();
```

Same code → Different behavior.

---

## 14. Collections Example

```java
List<Payment> list = new ArrayList<>();

list.add(new UpiPayment());
list.add(new CardPayment());

for(Payment p : list) {
    p.pay();
}
```

---

## 15. Industry Level Benefits

Using parent reference gives:

- Loose coupling
- Easy extension
- Runtime flexibility
- Cleaner code
- Framework compatibility

---

## 16. Golden Rules

### Rule 1
Reference type decides:
What methods you can call.

### Rule 2
Object type decides:
Which method runs.

---

## 17. Upcasting vs Downcasting

| Type | Casting Needed | Safe |
|---|---|---|
| Upcasting | No | Yes |
| Downcasting | Yes | Runtime Check |

---

## 18. Senior Developer Thinking

Always code to:

Parent class or Interface

Not to:

Child implementation

---

## 19. Simple Mental Model

Reference Type = Permission
Object Type = Real Capability

---

## 20. Final Summary

We use parent reference because:

- Allows polymorphism
- Allows runtime flexibility
- Helps scalable system design
- Used everywhere in real projects

---

End of Notes

