public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    public Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;

        this.isPass = false;
    }

    public void addBulExamleNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.not = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.not = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.not = kimya;
        }
    }
    public void addSozluExample(int mat,int fizik, int kimya){
        if (mat >= 0 && mat <= 100) {
            this.mat.szNot = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.szNot = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.szNot = kimya;
        }
    }

    public void isPass() {
        if (this.mat.not == 0 || this.fizik.not == 0 || this.kimya.not == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Gecti.");
            } else {
                System.out.println("Sınfta Kaldı. ");
            }
        }
    }

    public void calcAvarage() {

        int matOrt=(this.mat.not*80/100)+(this.mat.szNot*20/100);
        System.out.println(matOrt);
        int fzkOrt=(this.fizik.not*80/100)+(this.fizik.szNot*20/100);
        int kmyOrt=(this.kimya.not*80/100)+(this.kimya.szNot*20/100);
        this.avarage=(matOrt+fzkOrt+kmyOrt)/3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci : "+this.name);
        System.out.println("Matematik notu : "+this.mat.not);
        System.out.println("Fizik Notu : "+this.fizik.not);
        System.out.println("Kimya Notu : "+this.kimya.not);

    }
}


