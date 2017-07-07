package com.kozyrev;

/**
 * Created by sergii on 7/4/17.
 */
public class ShipTravel extends Travel {

    @Override public void chooseTour() {
        System.out.println("вы успешно подобрали круизный тур");

    }

    @Override public void checkWeather(){
        System.out.println("погодные условия идеальные для круиза");

    }

    @Override public void pay() {
        System.out.println("оплата круизного тура прошла успешно");


    }

    @Override public void refund() {
        System.out.println("ваш  круизный тур отменен");
    }

    @Override public void usetour() {
        System.out.println("вы можете успешно отправляться в круизный тур");

    }

    @Override public void tourSightseeng() {
        System.out.println("ваш круизный тур содержит посещещение основных достопримечательностей " +
                "который возможно увидеть с моря");


    }

    @Override public void feedbackMyTour() {
        System.out.println("ваш отзыв о круизном туре успешно оставлен на странице компании");

    }
}
