import easy.missingNumber;


public class Main
{public static void main(String[] args) {

    missingNumber solver = new missingNumber();

    int[] examples = {1, 2, 3, 4, 5, 6, 8};
    int result = solver.missingNumber(examples);
    System.out.println(result);

}
}