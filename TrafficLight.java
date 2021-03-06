//Elena Voinu
public enum TrafficLight {
    RED (" Stop"),
    YELLOW (" Wait"),
    GREEN (" Go");
    private final String action;

    //constructor always private
    private TrafficLight(String action){
        this.action = action;
    }
    //getter
    public String getAction(){
        return action;
    }

}
