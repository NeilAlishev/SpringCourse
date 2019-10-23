package ru.alishev.springcourse.genres;

import ru.alishev.springcourse.Music;

/**
 * @author Neil Alishev
 */
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Take five";
    }
}
