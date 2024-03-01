package 异常;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/*


class Triangle{
    Triangle(){
    }
    void sanjiao(int a,int b,int c){
        if(a+b>c && a-b<c) {
            System.out.println("a,b,c+构成三角形");
            if (a * a + b * b == c * c) {
                System.out.println("a,b,c构成直角三角形");
            }
        }
    }
}
class IllegalArgumentException extends Exception{
    String message;
    public IllegalArgumentException(String message){
        this.message=message;
    }
    public String toString(){
        return message+"a,b,c+不能构成三角形";
    }
}
public class 习题61  {
    public static void main(String[] args){
        Triangle s1=new Triangle();
        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        Scanner input3=new Scanner(System.in);
        int a,b,c;
        a=input1.nextInt();
        b=input2.nextInt();
        c=input3.nextInt();
        try{
            s1.sanjiao(a,b,c);
                throw new IllegalArgumentException("a,b,c+构成三角形，a:\n"+a+"b:"+b+"c:"+c+"\n");

        }
        catch(IllegalArgumentException e){
            System.out.println(e.toString());
        }
    }
}
*/
//正确答案
class Triangle{
    Triangle(){
    }
    void sanjiao(int a,int b,int c) throws IllegalArgumentException{
        if(a+b>c && c-a<b) {
            System.out.println("三角形三个边长是： "+a+"、"+b+"、"+c);
            if (a * a + b * b == c * c) {
                System.out.println("a,b,c构成直角三角形");
            }
        }
        else
            throw new IllegalArgumentException();
    }
}
public class 习题61 {
    public static void main(String[] args){
        try{
            int i[]=new int[3];
            System.out.println("请输入三角形的三条边：");
            Scanner input=new Scanner(System.in);
            i[0]=input.nextInt();
            i[1]=input.nextInt();
            i[2]=input.nextInt();
            Arrays.sort(i);
            Triangle t=new Triangle();
            t.sanjiao(i[0],i[1],i[2]);
        }
        catch (IllegalArgumentException i){
            System.out.println("a,b,c+不能构成三角形");
        }
    }

}

