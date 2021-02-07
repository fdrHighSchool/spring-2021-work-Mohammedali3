import java.util.Scanner;
import java.util.Arrays;

public class GradeBook{

  //instance Variables
 private SuperArray exams;
 private SuperArray homework;


 public GradeBook(){
    this.exams = new SuperArray();
    this.homework = new SuperArray();
  }//End constructor

  public void addExams(int vals){
    this.exams.add(vals);
  }//End addExams

  public void addHomework(int vals){
    this.homework.add(vals);
  }//End addHomework

  public void removeExams(int vals){
    this.exams.remove(vals);
  }//End removeExams

  public void removeHomework(int vals){
    this.homework.remove(vals);
  }//End removeHomework

 //Displays the Exams
  public String TEString(){
    return this.exams.toString();
  }//End TString
  /*
 //Displays the Homework
  public String THString(){
    return this.homework.toStirng();
  }//End THString
  */
}
