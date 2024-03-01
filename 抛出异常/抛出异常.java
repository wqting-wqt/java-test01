package 异常.抛出异常;

public class 抛出异常 {
    public static void test(int i){
        try {
            int[] arr={4,9};
            if(i>=arr.length)
                throw new Exception("数组下标越界了");
            else
                System.out.println("程序正常运行");
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
    public static void main(String[] args){
        test(1);
        System.out.println("-------------");
        test(3);
    }
}
