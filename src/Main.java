//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[] {12, 44,-58, 66, 134,4569, 745};

        ForSearchElArray searcherMaxElArray = new SearcherMaxElArray();
        int max = searcherMaxElArray.SearchElArray(array1);
        System.out.println(max);

        ForSearchElArray searcherMinElArray = new SearcherMinElArray();
        int min = searcherMinElArray.SearchElArray(array1);
        System.out.println(min);

        ForSearchElArray searcherEvenNumbArray = new SearcherEvenNumbArray();
        int evenNumb = searcherEvenNumbArray.SearchElArray(array1);
        System.out.println("Чётное число: " + evenNumb);

        ForSearchElArray searcherOddNumbArray = new SearcherOddNumbArray();
        int oddNumb = searcherOddNumbArray.SearchElArray(array1);
        System.out.println("Нечетное: " + oddNumb);
    }
}