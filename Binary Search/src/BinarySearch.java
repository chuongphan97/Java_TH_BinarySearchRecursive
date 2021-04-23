public class BinarySearch {
    public static int binarySearch(int[] arr, int low, int hight, int value){
        if (low > hight) return -1;
        int mid = low + (hight-low)/2;
        if (arr[mid] > value) return binarySearch(arr,low,mid-1,value);
        if (arr[mid] < value) return binarySearch(arr, mid+1, hight, value);
        else return mid;
    }
    public static int binarySearch(int[] arr, int value){
        return binarySearch(arr,0,arr.length-1,value);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,0,9,5));
        System.out.println(binarySearch(arr,5));
    }
}
