public class sumarray {
public static void main(String[] args) {
    int[] array = {5,10,15,20,25};
    int sum = 0;
    for (int num : array) {
        sum += num;
    }
    System.out.println("The sum of all element is "+ sum);
}
}
