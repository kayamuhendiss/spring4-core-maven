package com._05.collection.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection1 {

    private List<String> myList;
    private List<Person> myList2;
    private Set<Integer>mySet;
    private Map<String,Object>myMap;
    private Properties myProperties;

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public List<Person> getMyList2() {
        return myList2;
    }

    public void setMyList2(List<Person> myList2) {
        this.myList2 = myList2;
    }

    public Set<Integer> getMySet() {
        return mySet;
    }

    public void setMySet(Set<Integer> mySet) {
        this.mySet = mySet;
    }

    public Map<String, Object> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, Object> myMap) {
        this.myMap = myMap;
    }

    public Properties getMyProperties() {
        return myProperties;
    }

    public void setMyProperties(Properties myProperties) {
        this.myProperties = myProperties;
    }

    @Override
    public String toString() {
        return "CollectionInjection1{" +
                "myList=" + myList +
                ", myList2=" + myList2 +
                ", mySet=" + mySet +
                ", myMap=" + myMap +
                ", myProperties=" + myProperties +
                '}';
    }
}
