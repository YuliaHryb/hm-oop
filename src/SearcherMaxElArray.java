public class SearcherMaxElArray implements ForSearchElArray {
    public int SearchElArray (int[] incomingArray) {
        int max = incomingArray[0];
        for (int i = 1; i < incomingArray.length; i++) {
         if (incomingArray[i] > max) {
             max = incomingArray[i];
         }
        }
        return max;
    }
}
