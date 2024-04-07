public class Main {
    public static void main(String[] args) {

        StudentTest();

        RectangleTest();
    }

    public static void StudentTest(){

        Student student1 = new Student("anthi","37248932");






        System.out.println(student1.getCredits());
        System.out.println(student1.getLevelOfStudies());
        System.out.println(student1.getRegistrationNumber());

        student1.passUnit(10);
        System.out.println(student1.nextLevel());
    }

    public static void RectangleTest(){
        Rectangle rectangle1= new Rectangle(2,3);

        System.out.println("This is the Perimeter " + rectangle1.calcPerimeter());
        System.out.println("This is the Area " + rectangle1.calcArea());

    }
}