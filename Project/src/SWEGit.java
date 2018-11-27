/**
 *
 * @author Eldeeb
 */
public class SWEGit {
    /*  get the minimun 3 elements from a given array and return them as
    *   attrbitus of an object of ReturnValues ==> ReturnValues object;
    *   the first min is object.first attribute
    *   the second min is object.second attribute
    *   the third min is object.third arrribute
    */
    public static ReturnValues get_3_minmum(int []arr){
        int x = Integer.MAX_VALUE; int idx_x = -1;
        int y = Integer.MAX_VALUE; int idx_y = -1;
        int z = Integer.MAX_VALUE; int idx_z = -1;
        //iterate on all the element in the array
        for(int j = 0; j<3; j++){
            for(int i=0; i<arr.length; i++){
                if(j == 0){
                    // select the first min element
                    if(arr[i] < x){
                        x = arr[i];
                        idx_x = i;
                    }
                }else if(j == 1){
                    // select the second min element
                    if(arr[i] < y && i != idx_x){
                        y = arr[i];
                        idx_y = i;
                    }
                }else if(j == 2){
                    // select the third min element
                    if(arr[i] < z && i != idx_x && i != idx_y){
                        z = arr[i];
                        idx_z = i;
                    }
                }
            }
        }
        
        return new ReturnValues(x , y , z);
    }
    
}
