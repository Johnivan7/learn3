package com.kozyrev;

/**
 * Created by sergii on 7/4/17.
 */
public class Travel {
    int money;
    int day;
    int month;
    int year;
    int quontytypositivefeedbacks;
    int temperature;
    String sightseeng;

    //Travel vacation = new Travel();



    public void chooseTour(){
        System.out.println("вы успешно подобрали тур");

    }

    public void checkWeather(){
        System.out.println("погодные условия идеальные для путешествия");

    }

    public void pay (){
        System.out.println("оплата тура прошла успешно");

    }

    public void refund () {
        System.out.println("ваш тур отменен");

    }

    public void usetour () {
        System.out.println("вы можете успешно отправляться в ваш тур");
    }

    public void tourSightseeng() {
        System.out.println("ваш тур содержит посещещение основных достопримечательностей");

    }

    public void feedbackMyTour() {
        System.out.println("ваш отзыв о туре успешно оставлен на странице компании");


    }
}
