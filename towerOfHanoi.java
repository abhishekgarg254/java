public class towerOfHanoi {
    public static void TowerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // transfer top n-1 from src to helper using dest as 'helper'
        TowerOfHanoi(n - 1, src, dest, helper);
        // transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
        // transfer n-1 from helper to dest using src as 'helper'
        TowerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 2;
        TowerOfHanoi(n, "A", "B", "C");
    }
}