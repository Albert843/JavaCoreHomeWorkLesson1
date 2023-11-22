package ru.gb.jcore.sample;

import ru.gb.jcore.regular.OtherClass;
import ru.gb.jcore.regular.Decorator;

/**
 * Главный класс приложения, его назначение,
 * способы взаимодействия с ним.
 */
public class Main {
    /**
     * Точка входа в программу, старт программы
     * @param args стандартные аргументы командной строки.
     */
    public static void main(String[] args) {
        int result = OtherClass.add(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(2, 2);
        System.out.println(Decorator.decorate(result));
    }
}