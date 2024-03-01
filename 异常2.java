package 异常;

/*
    异常：
    当参数args[0]被输入0时（因为args[0]为0，即j=0，出现ArithmeticException异常）
    int j=Integer.parseInt("0");
    运行结果如下
          Exception in thread "main" java.lang.ArithmeticException: / by zero
	at 异常.main(异常.java:18)

    当参数args[0]被输入“a”时(parseInt无法把非整型字符串转化整型，出现NumberFormatException异常)
    int j=Integer.parseInt("a");
    运行结果如下
          Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at 异常.main(异常.java:11)

    当参数args[0]未被设置任何值时（因为args[0]未赋值，出现ArrayIndexOutOfBoundsException异常）
    int j=Integer.parseInt(args[0]);
    运行结果如下
         Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at 异常.main(异常.java:19)


 */
public class 异常2 {
    public static void main(String args[]) {
        int j=Integer.parseInt(args[0]);
        int i=100/j;
        System.out.println("i="+i);
        System.out.println("程序继续运行");
    }
}