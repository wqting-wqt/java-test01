package 异常;
/*
public class Student {

    private String name;
    private int age;

    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public int getAge() {

        return age;
    }
    public void setAge(int age) throws AgeLT0Exception, AgeGT150Exception {

        if (age < 0) {

            throw new AgeLT0Exception();
        } else if (age > 150) {

            throw new AgeGT150Exception();
        } else {

            this.age = age;
        }
    }
}
自定义异常类：年龄小于0抛出一个AgeLT0Exception
1
2
3
4
5
6
7
8
9
10
11
public class AgeLT0Exception extends Exception {

    public AgeLT0Exception() {

        this("年龄小于0异常");
    }
    public AgeLT0Exception(String message) {

        super(message);
    }
}
自定义异常类：年龄大于150 抛出一个AgeGT150Exception
1
2
3
4
5
6
7
8
9
10
11
public class AgeGT150Exception extends Exception {

    public AgeGT150Exception() {

        this("年龄大于150异常");
    }
    public AgeGT150Exception(String message) {

        super(message);
    }
}
测试类
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
public class TestStudent {

    public static void main(String[] args) {

        Student student = new Student();
        try {

            student.setAge(520);
        } catch (AgeLT0Exception e) {

            e.printStackTrace();
        } catch (AgeGT150Exception e) {

            e.printStackTrace();
        }

        try {

            student.setAge(-1);
        } catch (AgeLT0Exception | AgeGT150Exception e) {

            e.printStackTrace();
        }
    }
}
 */
class Student01{
    String name;
    int id;
    int age;
    Student01(){
    }
    public Student01(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
class voidException extends Exception{

}
public class 习题64  {

}

