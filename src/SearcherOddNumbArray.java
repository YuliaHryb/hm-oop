public class SearcherOddNumbArray implements ForSearchElArray{
    public int SearchElArray(int[] incomingArray) {
        int oddNumb = incomingArray[0];
        for (int i = 1; i < incomingArray.length; i++) {
            if (incomingArray[i] % 2 != 0) {
                oddNumb = incomingArray[i];
            }
        }
        return oddNumb;
    }
}
