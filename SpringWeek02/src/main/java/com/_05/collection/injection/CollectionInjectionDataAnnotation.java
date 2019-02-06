package com._05.collection.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("collectionInjectionDataAnnotationId")
public class CollectionInjectionDataAnnotation {
    @Autowired
    @Qualifier("listAnnotationId")
    private List<String> nameList;

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    @Override
    public String toString() {
        return "CollectionInjectionData{" +
                "nameList=" + nameList +
                '}';
    }
}
