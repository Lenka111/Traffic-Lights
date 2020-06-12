//Elena Voinu
public class Main {
    public static void main(String[] args) {

        //Create the enum instance array
        //assign the constants of the enum to this array
        //use values() method to get an array of enum values
        TrafficLight [] lights = TrafficLight.values();

        //iterate the array
        for (TrafficLight light: lights) {
            System.out.println("Light " + light.toString() + " Action " + light.getAction());

        }
    }
}
