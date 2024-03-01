package 异常.捕获异常;
/*
    格式：
    try {
            可能产生异常的代码块                     //try块
        }
        catch (ExceptionType e1){                  //要捕获的异常类型
            对此异常地处理                          //异常处理，可以为空
        }
        ......
        catch (ExceptionType en){                  //要捕获的异常类型
            对此异常地处理                          //异常处理，可以为空
        }



     异常：
    当参数args[0]被输入0时
    int j=Integer.parseInt("0");
    运行结果如下
          除数j不能为0
          程序继续运行

    当参数args[0]被输入“a”时
    int j=Integer.parseInt("a");
    运行结果如下
          请输入整数
          程序继续运行

    当参数args[0]未被设置任何值时
    int j=Integer.parseInt(args[0]);
    运行结果如下
         请给args[0]赋值
         程序继续运行
    正常输入：
        int j=Integer.parseInt("10");
     结果
        i=10
        程序继续运行
 */
public class trycatch子句 {
    public static void main(String args[]){
        try {
            int j=Integer.parseInt("10");
            int i=100/j;
            System.out.println("i="+i);
        }
        catch (ArithmeticException e){
            System.out.println("除数j不能为0");
        }
        catch (NumberFormatException e){
            System.out.println("请输入整数");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("请给args[0]赋值");
        }
        System.out.println("程序继续运行");
    }
}
