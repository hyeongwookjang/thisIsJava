package com.j33.javabyshow.ex;
import java.util.List;
import java.util.ArrayList;

public class EnumSample167 {

    enum Animal {Cat, Dog, Rabbit}

    class Pet {
        private Animal kind;
        private String name;
        public Pet(Animal aml, String nm) {
            kind = aml;
            name = nm;
        }
        public Animal getKind() {
            return kind;
        }
        public String getName() {
            return name;
        }
    }




}
