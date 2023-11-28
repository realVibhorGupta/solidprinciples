package designpatterns.behavoural.chainOfResponsibility;

public class AmbulanceHandler extends AbstractBaseHandler {
    @Override
    public void handle(VehicleType incomingSuspect) {
        if(VehicleType.AMBULANCE == incomingSuspect){
            System.out.println("Validate id for : " + incomingSuspect);
            return;
        }
        //delegate the handler to the next handler in the chain
        this.nextHandler.handle(incomingSuspect);
    }
}
