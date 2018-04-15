package ie.marcosmiranda.demo.pbowes.jsonreader.bean;

import java.util.HashMap;
import java.util.Map;

public class Stats {
    private long countFoo;
    private long countBar;
    private long countBaz;
    private Map<String, Integer> words = new HashMap<>();

    public long getNumberErrors() {
        return numberErrors;
    }

    public void setNumberErrors(long numberErrors) {
        this.numberErrors = numberErrors;
    }

    private long numberErrors;

    public long getCountFoo() {
        return countFoo;
    }

    public void setCountFoo(long countFoo) {
        this.countFoo = countFoo;
    }

    public long getCountBar() {
        return countBar;
    }

    public void setCountBar(long countBar) {
        this.countBar = countBar;
    }

    public long getCountBaz() {
        return countBaz;
    }

    public void setCountBaz(long countBaz) {
        this.countBaz = countBaz;
    }

    public Map<String, Integer> getWords() {
        return words;
    }

    public void setWords(Map<String, Integer> words) {
        this.words = words;
    }
}
