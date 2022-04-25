package ru.netology.manager;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;
import ru.netology.manager.PosterManager;

import static org.junit.jupiter.api.Assertions.*;

public class EmptyPosterManagerTest {
    private PosterManager manager = new PosterManager();
    private Film one = new Film(1, "one", "Comedy", "www.oneFilm.com");
    private Film two = new Film(2, "two", "Detective", "www.twoFilm.com");
    private Film three = new Film(3, "three", "Drama", "www.threeFilm.com");

    @Test
    void addToEmpty() {
        manager.add(one);
        Film[] actual = manager.findLast();
        Film[] expected = new Film[]{one};
        assertArrayEquals(expected, actual);
    }

    @Test
    void showEmpty() {
        Film[] actual = manager.findLast();
        Film[] expected = new Film[]{};
        assertArrayEquals(expected, actual);
    }

    @Test // показать добавленные фильмы в обратном порядке
    void getLastWithQuantityLessThanInList() {
        manager.add(one);
        manager.add(two);
        manager.add(three);
        Film[] actual = manager.findLast();
        Film[] expected = new Film[]{three,two,one};
        assertArrayEquals(expected, actual);
    }

    @Test // показать фильмы в порядке добавления
    void getAdded() {
        manager.add(one);
        manager.add(two);
        manager.add(three);
        Film[] actual = manager.findAll();
        Film[] expected = new Film[]{one,two,three};
        assertArrayEquals(expected, actual);
    }

    @Test // показать добавленные фильмы в обратном порядке (альтернативный код)
    void getLastAlternative() {
        manager.add(one);
        manager.add(two);
        manager.add(three);
        Film[] actual = manager.findLastAdd();
        Film[] expected = new Film[]{three,two,one};
        assertArrayEquals(expected, actual);
    }
}