/**
 * The class represent a simple specification of car. It has some properties relative to a car and some methods needed for properly use of a car.
 * @author Ana Keredchieva
 *
 */
public class Car {
    private static final int CURRENT_SHIFT_MIN_VALUE = 1;
    private static final int CURRENT_SHIFT_MAX_VALUE = 5;
    private static final int WEIGHT_MIN_VALUE = 500;
    private static final int WEIGHT_MAX_VALUE = 3500;
    private static final float CONSUMPTION_MIN_VALUE = 3.5f;
    private static final float CONSUMPTION_MAX_VALUE = 13.5f;
    private static final int BAG_VALUE = 60;
    private static final int PASSENGER_VALUE = 40;
    private static final int SEATS_MAX_VALUE = 8;
    private static final int SEATS_MIN_VALUE = 0;

    private int doors;
    private int seats;
    private String color;
    private String creationYear;
    private SteeringWheel steeringWheel;
    // Only one value could be provided for this property
    private static final String gearShift = "Manual";
    private int currentShift;
    private int weight;
    private float consumption;



/**
 * Constructor for customer to set the properties of the car.
 * @param color the color of the car.
 * @param consumption How much liters gas the car used for 100 kilometers.
 * @param creationYear When the car was created.
 * @param currentShift On which shift is the car at this moment.
 * @param doors How much doors the car has.
 * @param seats How much seats the car has.
 * @param steeringWheel What is the type of the wheel.
 * @param weight How much kilograms is the weight of the car.
 *
 *
 */
    public Car(int doors, int seats, String color, String creationYear, String steeringWheel, int currentShift, int weight, float consumption) {
        setDoors(doors);
        setSeats(seats);
        setColor(color);
        setCreationYear(creationYear);
        setSteeringWheel(steeringWheel);
        setCurrentShift(currentShift);
        setWeight(weight);
        setConsumption(consumption);
    }

    /**
     * Construct for default values of the properties.
     */
    public Car() {
        setDoors(0);
        setSeats(0);
        setColor("");
        setCreationYear("");
        setSteeringWheel("");
        setCurrentShift(0);
        setWeight(0);
        setConsumption(0.0f);
    }

    /**
     * Getter for the number of doors.
     * @return integer value of the number of doors.
     */
    private int getDoors() {
        return doors;
    }

    /**
     * Setter for the number of doors. There is no needed validation.
     * @param doors
     */
    private void setDoors(int doors) {
        this.doors = doors;
    }

    /**
     * Getter for the number of seats the car has. There is no needed validation.
     * @return integer value of the number if seats.
     */
    private int getSeats() {
        return seats;
    }

    /**
     * Setter for the number of seats. The number of the seats shouldn't be more then 8.
     * @param seats
     */
    private void setSeats(int seats) {
        if (seats <= SEATS_MAX_VALUE && seats >= SEATS_MIN_VALUE) {
            this.seats = seats;
        }else throw new IllegalArgumentException("The value of the parameter is incorrect.It should be positive number less then 8.");
    }

    /**
     * Getter for the color of the car.
     * @return string with the name of the color.
     */
    private String getColor() {
        return color;
    }

    /**
     * Setter for the color of the car. There is no need of validation.
     * @param color
     */
    private void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter for the year of creation of the car.
     * @return string with the year.
     */
    private String getCreationYear() {
        return creationYear;
    }

    /**
     * Setter for the year of creation of the car.The validation is that the year should be above 1900.
     * @param creationYear
     */
    private void setCreationYear(String creationYear) {
        if (creationYear.length() == 4 && creationYear.startsWith("19")) {
            this.creationYear = creationYear;
        }else throw new IllegalArgumentException("This year is too old to be true.");
    }

    /**
     * Getter for the side of the steering wheel
     * @return Enum of the chosen values.
     */
    private SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    /**
     * Setter for the side of the steering wheel. Tha validation is that there is only two possible values for this parameter.Everything else is incorrect value.
     * @param steeringWheel
     */
    //By requirements the steering wheel should be only left or right
    private void setSteeringWheel(String steeringWheel) {

            if (steeringWheel.equalsIgnoreCase(SteeringWheel.LEFT.toString())) {
                this.steeringWheel = SteeringWheel.LEFT;
            } else if (steeringWheel.equalsIgnoreCase(SteeringWheel.RIGHT.toString())) {
                this.steeringWheel = SteeringWheel.RIGHT;
            }else throw new IllegalArgumentException("There should be one of the two values: LEFT or RIGHT");

    }

    /**
     * Getter for the type of gear shift. We have only one possible value - Manual
     * @return String with the value of the gear shift
     */
    public static String getGearShift() {
        return gearShift;
    }

    /**
     * Getter for the gear shift at the current moment.
     * @return integer number of the current gear shift.
     */
    private int getCurrentShift() {
        return currentShift;
    }

    /**
     * Setter for the gear shift at the current moment. By requirements it should be integer number from 1 to 5.
     * @param currentShift
     */
    //By requirements the current shift should be no more then 5 and no less then 1
    private void setCurrentShift(int currentShift) {
        if (currentShift >= CURRENT_SHIFT_MIN_VALUE && currentShift <= CURRENT_SHIFT_MAX_VALUE) {
            this.currentShift = currentShift;
        }else throw new IllegalArgumentException("Tha value of the gear shift should be number between 1 and 5");
    }

    /**
     * Getter for the weight of the car.
     * @return integer value of the weight in kilograms
     */
    private int getWeight() {
        return weight;
    }

    /**
     * Setter for the weight of the car. By requirements it should be between 500 and 3500 kilograms
     * @param weight
     */
    //By requirements the weight of the vehicle should be between 500 and 3500 kilograms
    private void setWeight(int weight) {
        if (weight >= WEIGHT_MIN_VALUE && weight <= WEIGHT_MAX_VALUE) {
            this.weight = weight;
        }
    }

    /**
     * Getter for the consumption of the car.
     * @return float number of the consumption.
     */
    private float getConsumption() {
        return consumption;
    }

    /**
     * Setter for the consumption of the car. By requirement it should be between 3.5 and 13.5
     * @param consumption
     */
    //By requirements the consumption of the vehicle should be between 3.5 and 13.5 liters per kilometer
    private void setConsumption(float consumption) {
        if (consumption >= CONSUMPTION_MIN_VALUE && consumption <= CONSUMPTION_MAX_VALUE) {
            this.consumption = consumption;
        }else throw new IllegalArgumentException("The consumption should be between " + CONSUMPTION_MIN_VALUE + " and " + CONSUMPTION_MAX_VALUE +" l per km.");
    }

    /**
     * Methos for the information of the car.
     * @return String with all values of the properties of the car.
     */
    //The method return all of the information about the car.
    @Override
    public String toString() {
        return "The Specification of the car is:\n"
                + "Doors: " + this.getDoors() + "\n"
                + "SteeringWheel: " + this.getSeats() + "\n"
                + "Color: " + this.getColor() + "\n"
                + "Creation year: " + this.getCreationYear() + "\n"
                + "Steering wheel:: " + this.getSteeringWheel() + "\n"
                + "Gear shift: " + gearShift + "\n"
                + "Current shift: " + this.getCurrentShift() + "\n"
                + "Weight: " + this.getWeight() + " kg \n"
                + "Consumption: " + this.getConsumption() + "liter per kg \n";
    }

    /**
     * Compare the input parameter is equal with the color of the car.
     * @param colour input String for the chosen color to compare with.
     * @return the boolean value - if the colors match - true , if not-false.
     */
    // Compare the value from the input color with the value of the property color
    public boolean isEqualColor(String colour){
        return colour.equalsIgnoreCase(this.getColor());
    }

    /**
     * Compare if the input parameter is equal with the shift of the car in the current moment.
     * @param shift the input parameter
     * @return the boolean value - if the shifts match - true if not - false
     */
    public boolean isEqualShift(int shift){
        return shift==this.getCurrentShift();
    }

    /**
     * Increase the value of the shift. The validation is about if try to increase the shift above the possible shift numbers.
     */
    public void incrementShift() {
        int currentShiftVariable = this.getCurrentShift();
        if (currentShiftVariable < CURRENT_SHIFT_MAX_VALUE) {
            this.setCurrentShift(++currentShiftVariable);
        } else throw new IndexOutOfBoundsException("There is no more shift to increase.");
    }

    /**
     * Decrease the value of the shift. The validation is about if try to decrease the shift above the possible shift numbers.
     */
    public void decrementShift(){
        int currentShiftVariable = this.getCurrentShift();
        if (currentShiftVariable > CURRENT_SHIFT_MIN_VALUE)
        this.setCurrentShift(--currentShiftVariable);
        else throw new IllegalArgumentException("There is no more shift to decrease.");
    }

    /**
     * Check that whole passenger could sit in the car
     * @param passenger Number of the passengers.
     * @return Return true if all passenger can sit in the car.
     */

    public boolean isEnoughSeats(int passenger){
        return passenger < this.getSeats();
    }

    /**
     * Check if all passenger, bags and car is less then WEIGHT_MAX_VALUE
     * @param bags the number of bags
     * @param passenger the number of passengers
     * @return Return true if the weight is enough
     */
    public boolean isWeightInNorms(int bags, int passenger){
        int allWeight = this.getWeight() + (bags*BAG_VALUE) + (passenger*PASSENGER_VALUE);
        return allWeight <= WEIGHT_MAX_VALUE;
    }

    /**
     * Calculate how much fuel is needed to pass trough the input destination
     * @param destination number of kilometers that wanted to pass
     * @return Float number of needed liters of gas
     */
    public float needFuel(int destination){
        return this.getConsumption()*destination;
    }
}
