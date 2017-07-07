package com.kozyrev;

/**
 * Created by sergii on 7/4/17.
 */
public class BusTravel extends Travel {

    @Override public void chooseTour() {
        System.out.println("вы успешно подобрали автобусный тур");

    }

    @Override public void checkWeather(){
        System.out.println("погодные условия идеальные для автобусного тура");

    }

    @Override public void pay() {
        System.out.println("оплата автобусного тура прошла успешно");

    }

    @Override public void refund() {
        System.out.println("ваш автобусный тур отменен");

    }

    @Override public void usetour() {
        System.out.println("вы можете успешно отправляться в автобусный тур");

    }

    @Override public void tourSightseeng() {
        System.out.println("ваш автобусный тур содержит посещещение основных достопримечательностей");

    }

    @Override public void feedbackMyTour() {
        System.out.println("ваш отзыв о автобусном туре успешно оставлен на странице компании");

    }
}

