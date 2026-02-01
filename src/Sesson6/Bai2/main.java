package Sesson6.Bai2;
public class main {
    public static class Account{
        private String name;
        private String passWord;
        private String email;

        public Account(String name, String passWord, String email) {
            this.name = name;
            this.passWord = passWord;
            this.email = email;
        }

        public void info() {
            System.out.println("Ten:"+this.name);
            System.out.println("Email:"+this.email);
        }

        public void setPassWord(String passWord) {
            this.passWord = passWord;
            System.out.println("Doi mat khau thanh cong");
        }
    }
    public static void main(String[] args) {
        Account ac1=new Account("Vanhdz","123456789","vanh@gmail.com");
        ac1.info();
        ac1.setPassWord("123456");
    }
}
