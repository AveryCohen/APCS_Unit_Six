public class ArrayAlgorithms {

    public static boolean checkForAllNegatives(int[] list) {
int j = 0;
        for( int i=0; i< list.length; i++){
            if(list[i]>=0) {
                j--;
            }
        }
        if (j <0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean hasDupes(int[] list) {
        int k = 0;
        for( int i=0; i< list.length-1; i++){
            for( int j=i+1; j< list.length; j++) {
                if (list[i] == list[j]) {
                    k--;
                }
            }
        }
        if (k <0) {
            return true;
        }
        else {
            return false;
        }
    }


    public static int[] leftShift(int[] nums, int shift) {

        return new int[] {}; // placeholder to avoid errors. You may need to change this.
    }
}
