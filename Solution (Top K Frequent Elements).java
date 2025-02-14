class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<int[]> freqList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            freqList.add(new int[] { entry.getKey(), entry.getValue() });
        }

        freqList.sort((a, b) -> Integer.compare(b[1], a[1]));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = freqList.get(i)[0];
        }

        return result;
    }
}