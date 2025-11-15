package io.hexlet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

//    ArrayList<Integer> list = new ArrayList<>();// вынесли инициализацию  коллекции на уровень класса
//
//    public void init() {
//        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
//    }
//
//    @Test
//    public void testGet() {
////        ArrayList<Integer> list = new ArrayList<>();// можем вынести инициализацию коллекции на уровень класса
////        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));//необходимо вынести эти действия в отдельный метод
//
//        init();
//        assertEquals(1, list.get(0));
//    }
//
//    @Test
//    public void testContains() {
////        ArrayList<Integer> list = new ArrayList<>();// можем вынести инициализацию коллекции на уровень класса
////        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));//необходимо вынести эти действия в отдельный метод
//
//        init();
//        assertTrue(list.contains(5));
//    }
    /**
     * Вернёмся к вопросу о правильной инициализации нашей коллекции перед
     * началом каждого теста. Для решения этой проблемы тестовые фреймворки
     * предоставляют хуки — специальные методы, которые запускаются до или
     * после тестов.
     * Ниже пример того, как наполнить нашу коллекцию перед каждым тестом:
      */
    ArrayList<Integer> list = new ArrayList<>();

    @BeforeEach
    public void beforeEach() {
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
    }

    @Test
    public void testGet() {
        assertEquals(1, list.get(0));
    }


}
