public class Test {
    public static void main(String[] args) {
        // QuickFindUF Test
        QuickFindUF quickFindUF = new QuickFindUF(10);
        quickFindUF.union(1, 4);
        quickFindUF.union(4, 9);
        quickFindUF.union(2, 4);
        System.out.println(quickFindUF.connected(1, 2));
        System.out.println(quickFindUF.connected(1, 3));


        // QuickUnionUF Test
        QuickUnionUF quickUnionUF = new QuickUnionUF(10);
        quickUnionUF.union(1, 4);
        quickUnionUF.union(4, 9);
        quickUnionUF.union(2, 4);
        System.out.println(quickUnionUF.connected(1, 2));
        System.out.println(quickUnionUF.connected(1, 3));

        // QuickUnionUF_Weighted Test
        QuickUnionUF_Weighted quickUnionUF_Weighted = new QuickUnionUF_Weighted(10);
        quickUnionUF_Weighted.union(1, 4);
        quickUnionUF_Weighted.union(4, 9);
        quickUnionUF_Weighted.union(2, 4);
        System.out.println(quickUnionUF_Weighted.connected(1, 2));
        System.out.println(quickUnionUF_Weighted.connected(1, 3));

    }
}
