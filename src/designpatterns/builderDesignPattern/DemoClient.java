package designpatterns.builderDesignPattern;

public class DemoClient {
    public static void main(String[] args) {

        URLBuilder.Builder builder =  new URLBuilder.Builder();

        builder.protocol("https://").hostname("google.com");
        URLBuilder urlBuilder = builder.build();

        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
    }
}
