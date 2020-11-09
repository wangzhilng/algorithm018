public class ValidMountainArray {


        public boolean validMountainArray(int[] A) {
            if(A==null||A.length<3){
                return false;
            }
            int max=0;
            for (int i=1;i<A.length;i++){
                if (A[i]>=A[i-1]&&max==0){
                    if (i==A.length-1)
                        return false;
                    continue;
                }else if (A[i]<A[i-1]&&max==0){
                    if (i==1||i==A.length)
                        return false;
                    max=1;
                }else if (A[i]>=A[i-1]&&max==1){
                    return false;
                }else if (A[i]<A[i-1]&&max==1){
                    continue;
                }
            }
            return true;
        }




}
