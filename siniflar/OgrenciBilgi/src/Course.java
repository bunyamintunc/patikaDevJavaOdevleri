

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int not;
    int szNot;

    public Course(String name, String code,String prefix ){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.not=0;
        this.szNot=0;
    }

    public void  addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.courseTeacher=teacher;
            System.out.println("İslem Basarili");
        }
        else{
            System.out.println(teacher.name+" Akademisyeni bu dersi veremez...");
        }

    }

    public  void printTeacher(){
        if(courseTeacher !=null){
            System.out.println("Bu dersin akademisyeni : "+courseTeacher.name);
        }
        else{
            System.out.println(this.name+" Dersine akademisyen atanamamıştır.");
        }

    }
}
