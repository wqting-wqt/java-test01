package 异常;
class Student{
    private double regularGrade;
    private double experimentGrade;
    private double finalGrade;
    public Student( double regularGrade,double experimentGrade,double finalGrade){
        this.regularGrade=regularGrade;
        this.experimentGrade=experimentGrade;
        this.finalGrade=finalGrade;
    }
    public double getScore(){
        double score=(regularGrade+experimentGrade)*0.2+finalGrade*0.6;
        return score;
    }
}
class FailException extends Exception{
    String message;
    public FailException(String message){
        this.message=message;
    }
    public String toString(){
        return message+"本门课程不通过";
    }
}
public class 实例 {
    public static void main(String[] args){
        Student s1=new Student(50,40,60);
        try{
            if (s1.getScore()<60)
                throw new FailException("你的总评成绩不合格\n");
        }
        catch(FailException e){
            System.out.println(e.toString());
        }
    }
}

