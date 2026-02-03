package Sesson7.Bai1;

public class main{
    static class Student{
        private String studentId;
        private String studentName;
        private static int totalStudent=0;

        public Student(String studentId, String studentName) {
            this.studentId = studentId;
            this.studentName = studentName;
            totalStudent++;
        }
        void displayInfo(){
            System.out.println("Ma sv:" +this.studentId + "Ten:" + this.studentName);
        }
        static void displayTotalStudent(){
            System.out.println("So sinh vien da tao:" +totalStudent);
        }
    }

    public static void main(String[] args) {
        Student sv01=new Student("SV001","Vanh");
        sv01.displayInfo();
        Student.displayTotalStudent();
    }
}
