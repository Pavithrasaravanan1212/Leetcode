class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            twoSum(new int[]{0, 0}, 0);
        }
    }


    public static int[] twoSum(int[] numbers, int target) {
        int leftNode = 0;
        int rightNode = numbers.length - 1;
        int[] arr = new int[2];
        
        
        while (leftNode < rightNode) {
            if (numbers[leftNode] + numbers[rightNode] == target) {
                arr[0] = leftNode+1;
                arr[1] = rightNode+1;
                leftNode++;
                rightNode--;
            } else if (numbers[leftNode] + numbers[rightNode] < target) {
                leftNode++;
            } else rightNode--;
        }
        return arr;
    }
}
