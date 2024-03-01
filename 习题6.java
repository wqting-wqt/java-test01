package 异常;

public class 习题6 {
    /*public static void main(String [] args){method();}
        static void method(){
            try {
                System.out.println("test");
            }
            finally {
                System.exit(0);
                System.out.println("finally");
            }


         }

         */
    public static void main(String [] args){
        try{
            int[]a=new int[3];
            System.exit(0);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("发生异常");
        }
        finally {
            System.out.println("finally");
        }
    }
}


