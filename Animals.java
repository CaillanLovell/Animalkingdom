package Animalkingdom;

public abstract class Animals {

    ////////////////////Attributes////////////////////////
    private int age;


    ////////////////////Constructors//////////////////////


    ////////////////////Methods///////////////////////////
    public static void eat(String food) {
        System.out.println("Ate a bug");
    }



    public void sleep(int time){
        //this.wait(time);
    }

    public abstract Animals reproduce();

    public abstract String Breathe();

    public String excrete(){
        return "poo";
    }

    public void die(){
        //DIE
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
