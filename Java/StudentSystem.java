class Course{
    String name;
    String code;
    String prefix; 
    int note;
    int perfNote;
    Teacher crsTeacher;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note= 0;
    }
    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.crsTeacher = t;
            System.out.println("Operation is successful.");
        }else{
            System.out.println(t.name + " Academician cannot teach this course.");
        }
    }
    public void printTeacher(){
        if(crsTeacher != null){
            System.out.println("Academician of the " + this.name + " course : " + crsTeacher);
        }else {
            System.out.println( "No Academician has been assigned to the "+ this.name + " course");
        }
    }
}
class Teacher{
    String name;
    String branch;
    String mpno;

    public Teacher(String name, String branch, String mpno){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
}

class Student{
    String name, stuNo;
    int classes;
    Course crs1;
    Course crs2;
    Course crs3;
    double avarage;
    boolean isPass;

    public Student(String name, String stuNo, int classes, Course crs1, Course crs2, Course crs3){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.crs1 = crs1;
        this.crs2 = crs2;
        this.crs3 = crs3;
        calAvarage();
        this.isPass = false;
    }
  /*  public void addBulkExamNote(int crs1, int crs2, int crs3, int perfCrs1, int perfCrs2, int perfCrs3){
        if(crs1 >= 0 && crs1 <= 100 && perfCrs1 >= 0 && perfCrs1 <= 100){
            this.crs1.note = crs1;
            this.crs1.perfNote = perfCrs1;
        }
        if(crs2 >= 0 && crs2 <= 100 && perfCrs2 >= 0 && perfCrs2 <= 100){
            this.crs2.note = crs2;
            this.crs2.perfNote = perfCrs2;
        }
        if(crs3 >= 0 && crs3 <= 100 && perfCrs3 >= 0 && perfCrs3 <= 100){
            this.crs3.note = crs3;
            this.crs3.perfNote = perfCrs3;
        }
    }*/
    public void addBulkExamNote(int crs1, int crs2, int crs3){
        if(crs1 >= 0 && crs1 <= 100 ){
            this.crs1.note = crs1;
        }
        if(crs2 >= 0 && crs2 <= 100 ){
            this.crs2.note = crs2;
        }
        if(crs3 >= 0 && crs3 <= 100){
            this.crs3.note = crs3;
        }
    }
    public void addPerformanceNote(int perCrs1,int perCrs2,int perCrs3){
        if(perCrs1 >= 0 && perCrs1 <= 100){
            this.crs1.perfNote = perCrs1;
        }
        if(perCrs2 >= 0 && perCrs2 <= 100){
            this.crs2.perfNote = perCrs2;
        }
        if(perCrs3 >= 0 && perCrs3 <= 100){
            this.crs3.perfNote = perCrs3;
        }
    }
    public void isPass(){
        if(this.crs1.note == 0 || this.crs2.note ==0 || this.crs3.note == 0 ){
            System.out.println("Grades are not entered completely.");
        }else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Avarage : " + this.avarage);
            if(this.isPass){
                System.out.println("You passed.");            
            }else {
                System.out.println("You failed.");
            }
        }
    }
    public void calAvarage(){
        this.avarage=((((this.crs1.note)*(0.8))+ ((this.crs1.perfNote)*(0.2))) + (((this.crs2.note)*(0.8))+ ((this.crs2.perfNote)*(0.2))) + (((this.crs3.note)*(0.8))+ ((this.crs3.perfNote)*(0.2))))/ 3;
    }
    public boolean isCheckPass() {
        calAvarage();
        return this.avarage > 55;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Crs1 Note : " + this.crs1.note);
        System.out.println("Crs2 Note : " + this.crs2.note);
        System.out.println("Crs3 Note : " + this.crs3.note);
    }
}

public class StudentSystem {
    public static void main(String[] args) {
        Course mat = new Course("Mathematics", "MAT101", "MAT");
        Course phy = new Course("Physics", "PHY101", "PHY");
        Course chm = new Course("Kimya", "CHM101", "CHM");

        Teacher t1 = new Teacher("Peter Bishop", "MAT", "90550000000");
        Teacher t2 = new Teacher("Emilly Cooper", "PHY", "90550000001");
        Teacher t3 = new Teacher("Danny Wheeler ", "CHM", "90550000002");

        mat.addTeacher(t1);
        phy.addTeacher(t2);
        chm.addTeacher(t3);

        Student s1 = new Student("Joey Tribbiani", "140144015",3, mat, phy, chm);
        s1.addBulkExamNote(50,20,40);
        s1.addPerformanceNote(80, 75, 90);
        s1.isPass();
    }
}
