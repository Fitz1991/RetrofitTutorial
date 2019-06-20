package ru.mustakimov.retrofittutorial;


import java.util.List;

public class Test {
    private String name;
    private List<String> strings;
    private boolean stringExist;

    public boolean isStringExist() {
        return stringExist;
    }

    public void setStringExist(boolean stringExist) {
        this.stringExist = stringExist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public void setString(String string) {
        this.strings.add(string);
    }
}
