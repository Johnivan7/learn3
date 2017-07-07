package com.kozyrev;

/**
 * Created by sergii on 7/4/17.
 */
public class AviaTravel extends Travel {

    @Override public void chooseTour() {
        System.out.println("вы успешно подобрали авиатур");


    }

    @Override public void checkWeather(){
        System.out.println("погодные условия идеальные для полета");
    }

    @Override public void pay() {
        System.out.println("оплата авиатура прошла успешно");
    }

    @Override public void refund() {
        System.out.println("ваш авиа тур отменен");
    }

    @Override public void usetour() {
        System.out.println("вы можете успешно отправляться в авиатур");
    }

    @Override public void feedbackMyTour() {
        System.out.println("ваш отзыв о авие туре успешно оставлен на странице компании");


    }
}