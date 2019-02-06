package com._05.collection.injection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;


import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Properties;
@Service("collectionInjectionAnnotation")
public class CollectionInjectionDataAnnotation2 {

    @Value(value="#{myAnnotationList}")
    private List<String> myList;

    @Resource(name="myAnnotationPersonList")
    private List<Person> personList;

    @Resource(name="myAnnotationSet")
    private Set<Integer> mySet;

    @Resource(name="myAnnotationMap")
    private Map<String, Object> myMap;

    @Resource(name="myAnnotationProperties")
    private Properties myProperties;

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
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
        return "CollectionInjectionDataAnnotation2{" +
                "myList=" + myList +
                ", personList=" + personList +
                ", mySet=" + mySet +
                ", myMap=" + myMap +
                ", myProperties=" + myProperties +
                '}';
    }
}
