package JavaP;

public abstract class Marks {

    public abstract double getPercentage();
}
class A extends Marks{
    private double subject1,subject2,subject3;
    public A(double subject1,double subject2,double subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;}
    @Override
    public double getPercentage() {
        return ((subject1+subject2+subject3)/3)*100;
    }
}
class B extends Marks{
    double subject1,subject2,subject3,subject4;
    public B(double subject1,double subject2,double subject3,double subject4){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
        this.subject4=subject4;}
    @Override
    public double getPercentage() {
        return((subject1+subject2+subject3+subject4)/4)*100;
    }

    public static void main(String[] args) {
        A a=new A(100,50,20);
        System.out.println("student A percentage equal to "+" "+a.getPercentage());
        System.out.println("****************************************");
        B b=new B(40,20,100,100);
        System.out.println("student B percentage equal to "+" "+b.getPercentage());
    }
}
//12.	We have to calculate the average of marks obtained in
// three subjects by student A and by student B. Create class
// 'Marks' with an abstract method 'getPercentage' that will return
// the average percentage of marks. Provide implementation of abstract
// methods in classes 'A' and 'B'. The constructor of student A takes the
// marks in three subjects as its parameters and the marks in four
// subjects as its parameters for student B. Test your code