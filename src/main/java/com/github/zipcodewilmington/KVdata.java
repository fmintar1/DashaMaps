package com.github.zipcodewilmington;

public class KVdata implements Comparable<KVdata> {
    public String key;
    public Integer value;

    public KVdata() {
        key = "";
        value = 0;
    }

    public KVdata(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey(){
        return this.key;
    }

    public Integer getValue(){
        return this.value;
    }

    @Override
    public int compareTo(KVdata o) {
        if(o.key.equals(this.key)) return 0;
        else return 1;
    }
}