public class Teacher {
    // nitelikleri:
    String name;
    String mphone;
    String branch;

    // Constructor Metodu:Sınıfla aynı adı taşır başına void ve bir veri tipi almaz.3 tane parametre vereceğiz.
    Teacher(String name,String mphone, String branch){
        // this.name -parametre olarak aldığımız niteliklere eşliyoruz.
        this.name = name;
        this.mphone = mphone;
        this.branch = branch;

    }

    void print(){
        // Bu sınıfa ait nitelikleri kullanıyoruz. Bu sebeble this. yazıyoruz
        System.out.println("AD :" + this.name);
        System.out.println("TELEFON :" + this.mphone);
        System.out.println("BÖLÜM :" + this.branch);


    }
}
