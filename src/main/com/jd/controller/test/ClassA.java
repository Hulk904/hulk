package main.com.jd.controller.test;

import java.util.List;

public class ClassA {

    public static void main(String[] args) {
        iterator(new ClassA());
    }

    private static void iterator(Object o){

    }

    private List<ClassB> blist;

    public List<ClassB> getBlist() {
        return blist;
    }

    public void setBlist(List<ClassB> blist) {
        this.blist = blist;
    }
}
