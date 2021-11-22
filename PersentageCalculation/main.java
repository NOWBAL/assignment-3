package ASSIGNMENT_3.PersentageCalculation;

public class main {
    public static void main(String[] args) {
        StudentA nowfal=new StudentA(84,85,95);
       int marks= nowfal.getPersentage();
        System.out.println("student A persentage is"+marks);
        StudentB sulthan=new StudentB(65,50,85,90);
        int Marks=sulthan.getPersentage();
        System.out.println("student B persentage is"+ Marks);
    }
}
