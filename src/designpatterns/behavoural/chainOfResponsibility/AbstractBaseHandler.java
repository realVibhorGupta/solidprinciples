package designpatterns.behavoural.chainOfResponsibility;

public abstract class AbstractBaseHandler implements Handler{
    protected Handler nextHandler;
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }


}
