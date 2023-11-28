package designpatterns.behavoural.chainOfResponsibility;
enum VehicleType {
    AMBULANCE,
    SUV,
    BUS,
    TRAIN;
}
public class Main {
    public static void main(String[] args) {
        Main main =  new Main();
        Handler handler = main.getValidationHandler();
        VehicleType vehicleType = VehicleType.AMBULANCE;
        handler.handle(vehicleType);
    }

    public Handler getValidationHandler(){
        Handler civilianHandler = new CivilianVehicleHandler();
        AmbulanceHandler ambulanceHandler = new AmbulanceHandler();
        civilianHandler.setNextHandler(ambulanceHandler);

        return civilianHandler;
    }
}
