package com.cydeo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapService<T,ID> {

    public Map<ID,T> map = new HashMap<>();

    T save(ID id, T object){
        map.put(id, object);
        return object;
    }

    T findById(ID id){
        return map.get(id);
    }

    List<T> findAll(){
        return new ArrayList<>(map.values());
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void update(ID id, T object){
        map.put(id, object);
    }

}
