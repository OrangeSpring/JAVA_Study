public class Exec1{
    public static void main(String[] args){
        boolean[] data = new boolean[100];
        for( int i = 1; i <= 100; i ++ ){
            for( int j = i; j <= 100; j += i ){
                data[j-1] = !data[j-1];
            }
        }

        for( boolean tmp : data ){
            System.out.println(tmp);
        }
    }
}