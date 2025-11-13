import java.util.LinkedList;

// -----------------------------------
// MyStack 類別（要可被 JUnit 找到）
// -----------------------------------
class MyStack<T> extends LinkedList<T> {

    public MyStack() {
        super();
    }

    public void push(T item) {
        addLast(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return removeLast();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public int size() {
        return super.size();
    }
}

// -----------------------------------
// Person 類別（JUnit 測試需要）
// -----------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// -----------------------------------
// 主程式（可以自行測試）
// -----------------------------------
public class StackExample {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is empty: " + stack.isEmpty());

        MyStack<Person> personStack = new MyStack<>();
        personStack.push(new Person("Alice", 25));
        personStack.push(new Person("Bob", 30));

        System.out.println("Pop person: " + personStack.pop());
        System.out.println("Pop person: " + personStack.pop());
        System.out.println("Is empty: " + personStack.isEmpty());
    }
}
