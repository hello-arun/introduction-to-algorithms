public class Test {
    public static void main(String[] args) {
        
        System.out.println("linkedListStack Test Start");
        LinkedListStack linkedListStack = new LinkedListStack();
        for (String item : args) {
        if(item.equals("-")){
        System.out.println(linkedListStack.pop());
        }
        else
        linkedListStack.push(item);
        }
        System.out.println("LinkedListStack Test Complete.\n");

        
        System.out.println("ArrayStack test start");
        ArrayStack arrayStack = new ArrayStack(20);
        for (String item : args) {
            if (item.equals("-")) {
                System.out.println(arrayStack.pop());
            } else
                arrayStack.push(item);
        }
        System.out.println("ArrayStack Test Complete.\n");

    }
}
