package Sesson9.Bai4;

public class Main {
    public static void main(String[] args) {
        Animal animal=new dog();
        animal.Sounds();
        if(animal instanceof dog){
            dog dog=(dog) animal;
            dog.step();
        }
    }
}
