package ASSIGNMENT_3.PersentageCalculation;

public class StudentA extends Marks{
    private int sub1,sub2,sub3;
  StudentA(int sub1,int sub2,int sub3) {
      sub1=sub1;
      sub2=sub2;
      sub3=sub3;
  }
     int getPersentage(){
        return (sub1+sub2+sub3)/300*100;

    }
}
