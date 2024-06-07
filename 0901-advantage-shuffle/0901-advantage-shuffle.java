class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        int n=A.length;
        
        Integer t[]=new Integer[n];
        
        for(int i=0;i<n;i++)
            t[i]=i;
        int ans[]= new int[n];
        
        Arrays.sort(t,(i,j) -> B[i]-B[j]);
        Arrays.sort(A);
        int min=0;
        int max=n-1;
        
        for(int i=n-1;i>=0;i--)
        {
            int ind=t[i];
            if(B[ind]<A[max])
                ans[ind]=A[max--];
            else
                 ans[ind]=A[min++];
        }
        
        return ans;

    }
}