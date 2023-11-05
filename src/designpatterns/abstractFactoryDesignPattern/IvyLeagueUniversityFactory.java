package designpatterns.abstractFactoryDesignPattern;

public class IvyLeagueUniversityFactory extends UniversityFactory {
    @Override
    public AdmitCard getAdmitCard(String course) {
        switch (course) {
            case "Math"  : new MitAdmitCard();
            case  "Physics" :new CaltechAdmitCard();
            case "CS" : new GeogiaTechAdmitCard();
            default :
                break;
        }
        return null;


    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        return null;
    }
}
