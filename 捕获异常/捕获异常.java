package 异常.捕获异常;
/*
    异常：
    当参数args[0]被输入0时
    int j=Integer.parseInt("0");
    运行结果如下
          捕获到除法为0异常
toString()信息：java.lang.ArithmeticException: / by zero
getMessage()信息：/ by zero
程序继续运行

    当参数args[0]被输入“a”时
    int j=Integer.parseInt("a");
    运行结果如下
          捕获到输入非整数异常
toString()信息：java.lang.NumberFormatException: For input string: "a"
getMessage()信息：For input string: "a"
程序继续运行

    当参数args[0]未被设置任何值时
    int j=Integer.parseInt(args[0]);
    运行结果如下
         捕获到未设置参数异常
toString()信息：java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
getMessage()信息：Index 0 out of bounds for length 0
程序继续运行

 */
public class 捕获异常 {
    public static void main(String args[]){
        try {
            int j=Integer.parseInt("a");
            int i=100/j;
            System.out.println("i="+i);
        }
        catch (ArithmeticException e){
            System.out.println("捕获到除数为0异常");
            System.out.println("toString()信息："+e.toString());
            System.out.println("getMessage()信息："+e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("捕获到输入非整数异常");
            System.out.println("toString()信息："+e.toString());
            System.out.println("getMessage()信息："+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("捕获到未设置参数异常");
            System.out.println("toString()信息："+e.toString());
            System.out.println("getMessage()信息："+e.getMessage());
        }
        System.out.println("程序继续运行");
    }
}
