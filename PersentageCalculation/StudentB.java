package ASSIGNMENT_3.PersentageCalculation;

public class StudentB extends Marks{
    int sub1,sub2,sub3,sub4;
    StudentB(int sub1,int sub2,int sub3,int sub4){
        sub1=sub1;
        sub2=sub2;
        sub3=sub3;
        sub4=sub4;
    }
    @Override
    int getPersentage() {
        return (sub1+sub2+sub3+sub4)/400 * 100;
    }
}
