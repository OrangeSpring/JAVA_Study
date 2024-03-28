public class ArrayCopy{
    public static void main(String[] args){
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};

        int[] array2 = Arrays.copyOf(array1, array1.length);
    }
}