class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int count =0;
        int ii = 1;
        for(int j=0;j<arr.length;){
             if(ii>=arr.length){
                count++;
                break;
             }
             if(ii<arr.length && arr[j][0] >arr[ii][0] ){
                arr[j][0] = arr[ii][0];
             }
             else if(ii<arr.length && arr[j][0] >arr[ii][1] ){
                ii++;
                count++;
             }
             if(ii<arr.length && arr[j][1]>=arr[ii][1]){
                    ii++;
                    
             }
            
             else if(ii<arr.length && arr[j][1]<arr[ii][1]){
                    if(arr[j][1] >=arr[ii][0]) {
                        arr[j][1] = arr[ii][1];
                        ii++;
                    }
                    else{
                        count++;
                        j=ii;
                        ii++;
                    }
             }
          //   System.out.println(ii + " " + j);
        }
        // System.out.println();
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i][0] + " " + arr[i][1]);
        // }
        // System.out.println("count ->" + count);
        int ans[][] = new int[count][2];
        int idx = 0 ;
        int curr = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i][1] > curr){
                ans[idx][0] = arr[i][0];
                ans[idx][1] = arr[i][1];
                idx++;
                curr = arr[i][1];
            }
        }
        return ans;
    }
}