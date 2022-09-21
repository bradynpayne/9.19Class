public class Human {
    String name;
    int height;
    int grade;

    Human(String name, int height, int grade){
        this.name = name;
        this.height = height;
        this.grade = grade;

    }

    public void printAttributes() {
        System.out.println(name + " " + height + " " + grade);
    }
}
