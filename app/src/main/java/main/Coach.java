package main;

public class Coach{
  private int coach;
  private int student;
  private int[] time;//(0) 08:00~10:00　(1) 10:30~12:30　(2) 14:00~16:00　(3) 16:30~18:30　(4) 19:00~21:00

  public Coach(int coach,int student,int[] time){
    this.coach = coach;
    this.student = student;
    this.time = time;
  }

  public int getCoach() {
    return coach;
  }

  public int getStudent() {
    return student;
  }

  public int[] getTime() {
    return time;
  }

  public void setCoach(int coach) {
    this.coach = coach;
  }

  public void setStudent(int student) {
    this.student = student;
  }

  public void setTime(int[] time) {
    this.time = time;
  }
}