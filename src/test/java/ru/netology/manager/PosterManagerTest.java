
package ru.netology.manager;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;
import org.junit.jupiter.api.BeforeEach;
import ru.netology.manager.PosterManager;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest{
    private PosterManager manager = new PosterManager();
    private Film one = new Film(1, "one", "Comedy", "www.oneFilm.com");
    private Film two = new Film(2, "two", "Detective", "www.twoFilm.com");
    private Film three = new Film(3, "three", "Drama", "www.threeFilm.com");
    private Film four = new Film(4, "four", "Horror", "www.fourFilm.com");
    private Film five = new Film(5, "five", "Anime", "www.fiveFilm.com");
    private Film six = new Film(6, "six", "Biography", "www.sixFilm.com");
    private Film seven = new Film(7, "seven", "Military", "www.sevenFilm.com");
    private Film eight = new Film(8, "eight", "Story", "www.eightFilm.com");
    private Film nine = new Film(9, "nine", "Music", "www.nineFilm.com");
    private Film ten = new Film(10, "ten", "Thriller", "www.tenFilm.com");
    private Film eleven = new Film(11, "eleven", "Fantasy", "www.elevenFilm.com");

    @BeforeEach
    public void setUp() {
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
    }

    @Test //показать последние 9 фильмов из списка
    void getLastWithQuantityMoreThanInList() {
        Film[] actual = manager.findLast();
        Film[] expected = new Film[]{nine, eight, seven, six, five, four, three, two, one};
        assertArrayEquals(expected, actual);
    }

    @Test // показать последние 10 фильмов
    void getLastWithQuantityLessThanInList() {
        manager.add(ten);
        manager.add(eleven);
        Film[] actual = manager.findLast();
        Film[] expected = new Film[]{eleven, ten, nine, eight, seven, six, five, four, three, two};
        assertArrayEquals(expected, actual);
    }
}


