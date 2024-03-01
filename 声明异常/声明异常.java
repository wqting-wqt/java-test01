package 异常.声明异常;
/*
   格式：
   返回类型 方法名（参数列表）  throws Exception1，Exception2，......{
      ......
                 throw 异常实例;
       .......
       }
 */
public class 声明异常 {
    public static void test(int i) throws Exception{
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
        try {
            test(1);
            System.out.println("-------------");
            test(3);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

    }
}
