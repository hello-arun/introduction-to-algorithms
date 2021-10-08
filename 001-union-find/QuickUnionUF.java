public class QuickUnionUF {
    /*
     * id contains root information of each number initially id of each number is
     * number itself
     */
    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        /*
         * change root of p to root of q
         */
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
