public class SearcherEvenNumbArray implements ForSearchElArray {

    public int SearchElArray(int[] incomingArray) {
        int evenNumb = incomingArray[0];
        for (int i = 1; i < incomingArray.length; i++) {
            if (incomingArray[i] % 2 == 0) {
                evenNumb = incomingArray[i];
            }
        }
        return evenNumb;
    }
}
