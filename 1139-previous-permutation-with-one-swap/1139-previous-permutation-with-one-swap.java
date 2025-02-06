class Solution {
    public int[] prevPermOpt1(int[] arr) {

        int i = arr.length - 2;
        while (i >= 0 && arr[i] <= arr[i + 1]) {
            i--;
        }

        if (i == -1)
            return arr;

        int j = arr.length - 1;

        while (arr[j] >= arr[i] || arr[j] == arr[j - 1]) {
            j--;
        }

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

        return arr;
    }
}