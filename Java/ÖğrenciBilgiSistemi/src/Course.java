public class Course {
    Teacher teacher; // teacher sınıfından teacher adlı bir nitelik alıyoruz.
    String name;
    String code;
    String prefix; // teacher branch ile aynı olmasını bekleyeceğiz ki bir derse baska bir ders eklenmesin.
    int note;
    int performanceNote;

    Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;

    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor!");
        }

    }

    void printTeacher(){
        this.teacher.print();
    }

}
