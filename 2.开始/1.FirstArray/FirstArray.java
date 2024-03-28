public class FirstArray{
    public static void main(String[] args){
        int[] intArray = new int[10];//数组的定义
        int[] intArray2 = new int[]{1, 2, 3, 4, 5, 6};//数组的定义2
        int[] intArray3 = {1, 2, 3, 4, 5, 6};//数组的定义3

        intArray[0] = 233;

        System.out.println(intArray[0]);

        boolean[] boolArray = new boolean[10];
        System.out.println(boolArray[0]);

        String[] stringArray = new String[10];
        System.out.println(stringArray[0]);

        System.out.println("第一种循环输出");
        for( int i = 0; i < intArray2.length; i ++ ){
            System.out.println(intArray2[i]);
        }

        System.out.println("第二种循环输出");
        for( int c : intArray2 ){
            System.out.println(c);
        }

        System.out.println("斐波那契额数列的第20位");
        int[] data = new int[20];
        data[0] = 1;
        data[1] = 2;
        for( int i = 2; i < 20; i ++ ){
            data[i] = data[i-1] + data[i-2];
        }
        System.out.println(data[19]);
    }
}