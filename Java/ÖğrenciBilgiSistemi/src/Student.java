public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stdNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stdNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;

    }
        void AddBulkExamNote(int note1, int note2, int note3){
            if(note1 >= 0 && note1 <= 100){
                this.c1.note = note1;
            }
            if(note2 >= 0 && note2 <= 100){
                this.c2.note = note2;

            }
            if(note3 >= 0 && note3 <= 100){
                this.c3.note = note3;
            }
        }

        void AddBulkPerformanceNote(int note1, int note2, int note3){
            if(note1 >= 0 && note1 <= 100){
                this.c1.note = note1;
            }
            if(note2 >= 0 && note2 <= 100){
                this.c2.note = note2;

            }
            if(note3 >= 0 && note3 <= 100){
                this.c3.note = note3;
         }
        }


        void isPass(){
            System.out.println("--------------------------------------------");
            this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0 ;
            if(this.average > 55 ){
                System.out.println("Sınıfı Geçtiniz");
                this.isPass = true;
            }else {
                System.out.println("Hababam Sınıfı Sınıfta Kaldı.");
                this.isPass = false;
            }

            printNote();

        }

        public void calcAverage() {
            this.average = ((this.c1.note*0.8+this.c1.performanceNote*0.2)
                    + this.c2.note*0.7+this.c2.performanceNote*0.3
                    + this.c3.note*0.6+this.c3.performanceNote*0.4) / 3;
        }

        void printNote(){
            System.out.println(this.c1.name + "Notu :" +this.c1.note);
            System.out.println(this.c2.name + "Notu :" +this.c2.note);
            System.out.println(this.c3.name + "Notu :" +this.c3.note);
            System.out.println("Ortalamanız:" + this.average);


        }
    }

