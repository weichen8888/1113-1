import java.util.LinkedList;

public class StackExample {

    // ==========================
    // 自訂可放入任意類別的 Stack 類別
    // ==========================
    public static class MyStack<T> extends LinkedList<T> {

        public MyStack() {
            super();
        }

        public void push(T item) {
            addLast(item); // 使用 LinkedList 的尾端作為 stack top
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

    // ==========================
    // 測試物件 (不要改名)
    // ==========================
    static class Person {
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

    // ==========================
    // 主程式：測試 Stack 功能
    // ==========================
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
