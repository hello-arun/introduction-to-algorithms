/*
Two element p,q are connected if they have same id.
Let's implemet it
*/
public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    public static void main(String[] args) {
        QuickFindUF quickFindUF = new QuickFindUF(10);
        quickFindUF.union(2, 4);
        quickFindUF.union(2, 9);
        quickFindUF.union(2, 9);
        System.out.println(quickFindUF.connected(2, 5));
        System.out.println(quickFindUF.connected(4, 9));
    }
}