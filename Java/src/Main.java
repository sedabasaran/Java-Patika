public class Main {
    public static void main(String[] args){
        Teacher t1 = new Teacher("Mahmut Hoca","01234","TRH");
        Teacher t2 = new Teacher("Graham Bell","10241","FZK");
        Teacher t3 = new Teacher("Kül Yutmaz","10371","BIO");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","101","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","101","BIO");

        Student s1 = new Student("İnek Şaban","1361", "4",tarih,fizik,biyo);
        s1.AddBulkExamNote(100,78,50);
        s1.AddBulkPerformanceNote(50,40,100);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi","2414","4",tarih,fizik,biyo);
        s2.AddBulkPerformanceNote(17,39,100);
        s2.AddBulkExamNote(70,60,50);
        s2.isPass();

    }
}

