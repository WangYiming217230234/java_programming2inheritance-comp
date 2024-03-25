//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击间距中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Search {

    public static int binarySearch(int[] sortedArray, int target) {
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Left: " + left + ", Mid: " + mid + ", Right: " + right);

            if (sortedArray[mid] == target) {
                return mid;
            } else if (sortedArray[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {3, 8, 15, 17, 22, 36, 45};
        int target = 22;

        int resultIndex = binarySearch(data, target);
        if (resultIndex == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + resultIndex);
        }
    }
}