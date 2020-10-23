public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        //采用几分法 有几个数组进行几分

        for (int i=0;i<matrix.length;i++){
            int index=0;
            if (matrix[i][matrix[i].length-1]>=target){

             boolean b=   myBinarySearch(matrix[i],target);
             if (b)
                 return true;
            }
        }



        return false;

    }
    public static boolean myBinarySearch(int[] arr,int value) {
        int low=0;
        int high=arr.length-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(value==arr[mid]) {
                return true;
            }
            if(value>arr[mid]) {
                low=mid+1;
            }
            if(value<arr[mid]) {
                high=mid-1;
            }

        }
        return false;//没有找到返回-1
    }

}
