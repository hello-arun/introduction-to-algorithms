public class Test {
    public static void main(String[] args) {
        LinkedListStack linkedListStack = new LinkedListStack();
        for (int i= 0 ;i <args.length; i++) {
            String item=args[i];
            if(item.equals("-")){
                System.out.println(linkedListStack.pop());
            }
            else
            linkedListStack.push(item);
        }


    }
}
