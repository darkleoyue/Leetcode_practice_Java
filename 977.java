class Solution {
    public int[] sortedSquares(int[] A) {

        int n = A.length;
        int[] a = new int[n];
        for(int i = 0; i < n; i ++){
            a[i] = A[i] * A[i];
        }
        Arrays.sort(a);
        return a;
        
    }
}
