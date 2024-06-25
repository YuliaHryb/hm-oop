public class SearcherMinElArray implements ForSearchElArray {
    public int SearchElArray(int[] incomingArray) {
        int min = incomingArray[0];
        for (int i = 1; i < incomingArray.length; i++) {
            if (incomingArray[i] < min) {
                min = incomingArray[i];
            }
        }
        return min;
    }
}
