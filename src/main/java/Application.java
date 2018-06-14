public class Application {
    public static void main(String[] args) {
        Car car = new Car( 2,4,"blue","1994","right",4,1500,5.6f);
        System.out.println(car.toString());
        System.out.println(car.isEnoughSeats(2));
        System.out.println(car.isEqualColor("red"));
        System.out.println(car.isEqualShift(1));
        System.out.println(car.isWeightInNorms(4,2));
        car.incrementShift();
        System.out.println(car.needFuel(20000));
        System.out.println(car.toString());
        car.decrementShift();
        System.out.println(car.toString());


    }
}
