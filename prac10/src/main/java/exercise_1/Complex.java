package exercise_1;

public class Complex {
    private int real;
    private int image;

    /*
      Создает комплексное число с рандомными коэффициентами

     */
    public Complex(){
        this.real=(int)Math.random();
        this.image=(int)Math.random();
    }
    public Complex(int real,int image){
        this.real=real;
        this.image=image;
    }

    @Override
    public String toString() {
        return real+" + "+image+" * i";
    }
}
