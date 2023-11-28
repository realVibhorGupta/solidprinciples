package designpatterns.behavoural.chainOfResponsibility;

public interface Handler {

    void setNextHandler(Handler handler);

    void handle(VehicleType incomingSuspect);
}
