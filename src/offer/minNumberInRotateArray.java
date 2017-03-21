package offer;

/**
 * Created by liangnan on 17/3/18.
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class minNumberInRotateArray {
    public static int minNumber(int [] array) {
        int len = array.length;
        if(len == 0)
            return 0;

        int left = 0, right = len - 1;
        int mid = left;

        while(array[left] >= array[right]) {
            if(right - left == 1){
                mid = right;
                break;
            }
            mid = (left + right) / 2;

            if(array[left] == array[right] && array[left] == array[mid]){
                int min = array[left];
                for(int i = left + 1; i <= right; i++){
                    if(array[i] < min)
                        min = array[i];
                }
                return min;
            }

            if(array[mid] >= array[right])
                left = mid;
            else if(array[mid] <= array[right])
                right = mid;


        }
        return array[mid];
    }


    public static int minNumber_2(int [] array) {
        int len = array.length;
        if(len == 0)
            return 0;

        int left = 0, right = len - 1;

        while(left < right){
            int mid = left + (right - left)/2;
            if(array[mid] > array[right])
                left = mid + 1;
            else if(array[mid] == array[right])
                right = right - 1;
            else
                right = mid;
        }

        return array[left];

    }


    public static void main(String[] args) {
        int[] array = {3,4,5,1,2};
//        int[] array = {1,1,1,0,1};
        minNumber_2(array);
        System.out.println(minNumber(array));
    }

}
