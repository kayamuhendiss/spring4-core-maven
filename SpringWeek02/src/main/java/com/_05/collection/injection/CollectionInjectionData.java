package com._05.collection.injection;

import java.util.List;

public class CollectionInjectionData {
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
