package textbook.异常;
/*
    异常：
          Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0
    表述如下：
          
 */
public class 引例 {
    public static void main(String[]args) {
        int j=Integer.parseInt(args[1]);
        int i=100/j;
        System.out.println("i="+i);
        System.out.println("程序继续运行");
    }
}
