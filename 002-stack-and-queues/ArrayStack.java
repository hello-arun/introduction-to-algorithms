public class ArrayStack {
    int size=-1;
    String[] items;

    public ArrayStack(int capacity){
        items = new String[capacity];
    }
    public boolean isEmpty() {
        return size==-1;
    }

    public void push(String item) {
        items[++size]=item;
    }

    public String pop() {
        String item = items[size];
        items[size--] = null;
        return item;
    }
}
