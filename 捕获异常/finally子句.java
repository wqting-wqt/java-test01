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
        ......
        finally{
        //始终会被执行，用于释放资源
        }
 */
public class finally子句 {
    public static void main(String args[]){
        try {
            int j=Integer.parseInt(args[0]);
            int i=100/j;
            System.out.println("i="+i);
        }
        catch (ArithmeticException e){
            System.out.println("捕获到除数为0异常");
        }
        catch (NumberFormatException e){
            System.out.println("捕获到输入非整数异常");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("捕获到未设置参数异常");
        }
        finally {
            System.out.println("finally语句总会被执行运行");
        }

    }
}
