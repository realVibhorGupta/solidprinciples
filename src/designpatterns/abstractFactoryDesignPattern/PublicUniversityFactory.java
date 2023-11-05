package designpatterns.abstractFactoryDesignPattern;

public class PublicUniversityFactory extends UniversityFactory {
    @Override
    public AdmitCard getAdmitCard(String course) {
         switch (course) {
           case "Math"  : new USCAAdmitCard();
           case  "Physics" :new VSUAdmitCard();
           case "CS" : new AUSAdmitCard();
           default :
               break;
       }
       return null;
    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        switch (course) {
            case "Math"  : new USCCalculator();
            case  "Physics" :new VSUCalculator();
            case "CS" : new AUSFeedCalculator();
            default :
                break;
        }
        return null;
    }
}
