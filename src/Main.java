import java.util.*;




public class Main {
    public static void main(String[] args) throws MyEmptyStackException {

        StackLinkedList <Number> stack = new StackLinkedList<>();
        stack.push(3);
        stack.push(45);
        stack.push(3.4);
        // stack.push("This is a test");
//        System.out.println(stack);
        stack.displayStack();



        /*
        Stack stack = new StackLinkedList();
        stack.push("This is a string");
        stack.push(5);
        stack.peek();
        System.out.println("Is empty "
        +stack.isEmpty() );
        System.out.println("Pop = " +
                stack.pop());
        stack.peek();



        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("String");
        HashMap<String , Double> grades = new HashMap<>();
        grades.put("Ali",35.0);
        System.out.println(grades);
        grades.put("Pelin",90.0);
        System.out.println(grades);
        grades.put("Enes",10.0);
        System.out.println(grades);
        grades.put("Ali",60.0);
        System.out.println(grades);
        System.out.println(grades.keySet().getClass());

     */

    }
}