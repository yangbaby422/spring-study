package com.spring.aop.IoC.exercise;

import java.util.List;

/**
 * Created by HP on 2019-03-04.
 */
public class Meeting {
    private String theme;
    private List<Boss> bosses;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Boss> getBosses() {
        return bosses;
    }

    public void setBosses(List<Boss> bosses) {
        this.bosses = bosses;
    }

    public Meeting() {

    }

    public Meeting(String theme, List<Boss> bosses) {
        this.theme = theme;
        this.bosses = bosses;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "theme='" + theme + '\'' +
                ", bosses=" + bosses +
                '}';
    }
}
