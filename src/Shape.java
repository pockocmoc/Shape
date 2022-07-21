/*
Класс Box является контейнером, он можем содержать в себе другие фигуры.
 Метод add() принимает на вход Shape. Нужно добавлять новые фигуры до тех пор, пока для них хватаем места в Box (будем считать только объём, игнорируя форму. Допустим, мы переливаем жидкость).
Если места для добавления новой фигуры не хватает, то метод должен вернуть false.
 */

public class Shape {
    public static void main(String[] args) {
        Ball ball = new Ball(4.5);
        Cylinder cylinder = new Cylinder(2,2);
        Pyramid pyramid = new Pyramid(100, 100);

        Box box = new Box(1000);

        System.out.println(box.add(ball)); // ok
        System.out.println(box.add(cylinder)); // ok
        System.out.println(box.add(pyramid));   // failed
    }

}
