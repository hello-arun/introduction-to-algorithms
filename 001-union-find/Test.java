public class Test {
    public static void main(String[] args) {
        QuickUnionUF quickUnionUF = new QuickUnionUF(10);
        quickUnionUF.union(1, 4);
        quickUnionUF.union(4, 9);
        quickUnionUF.union(2, 4);

        System.out.println(quickUnionUF.connected(1, 2));
        System.out.println(quickUnionUF.connected(1, 3));

    }
}
