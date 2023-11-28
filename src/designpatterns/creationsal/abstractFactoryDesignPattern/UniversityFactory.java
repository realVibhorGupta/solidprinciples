package designpatterns.creationsal.abstractFactoryDesignPattern;

//main basic abstract class
public abstract class UniversityFactory {

    public static int cutOff = 100;

    public static UniversityFactory getUniversityFactory(int score) {
        if (score > cutOff) {
            return new IvyLeagueUniversityFactory();
        } else {
            return new PublicUniversityFactory();
        }
    }

    public abstract AdmitCard getAdmitCard(String course);

    public abstract FeeCalculator getFeeCalculator(String course);

}
