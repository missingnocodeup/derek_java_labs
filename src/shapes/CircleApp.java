package shapes;
import util.Input;
import java.text.DecimalFormat;
import java.util.Scanner;
public class CircleApp {
    public static void main(String[] args) {
        DecimalFormat numberFormat = new DecimalFormat(".000");
        moreCircles();

    }
    public static void moreCircles(){
        DecimalFormat numberFormat = new DecimalFormat(".000");
        Input input = new Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius of the Circle");
        int myRadius = sc.nextInt();
        Circle myCircle = new Circle(myRadius);
        double area = myCircle.getArea();
        System.out.println(numberFormat.format(area));
        System.out.println(numberFormat.format(myCircle.getCircumference()));
        if(input.yesNo()){
            moreCircles();
        } else{
            System.out.printf("You made %d circles", Circle.counter);
        }

    }
}
