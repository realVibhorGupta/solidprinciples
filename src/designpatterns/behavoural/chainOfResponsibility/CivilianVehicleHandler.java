package designpatterns.behavoural.chainOfResponsibility;

public class CivilianVehicleHandler  extends  AbstractBaseHandler{
    @Override
    public void handle(VehicleType incomingSuspect) {
        if(VehicleType.SUV == incomingSuspect){
            System.out.println("Validate id for : " + incomingSuspect);
            return;
        }
        //delegate the handler to next handler in the chain
        this.nextHandler.handle(incomingSuspect);
    }
}
