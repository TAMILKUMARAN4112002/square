import java.util.Scanner;

class Square{
    float side;
    float area;
    void acceptInput(){
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter a side : ");
         side = sc.nextFloat();
    }
    void calcArea(){
        area = side*side;
    }
    void dispArea(){
        System.out.print("the area :"+area);
    }
}
class Main{
    public static void main(String [] args){
         Square s= new Square();
         s.acceptInput();
         s.calcArea();
         s.dispArea();
    }
}
