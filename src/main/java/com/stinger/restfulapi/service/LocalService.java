package com.stinger.restfulapi.service;

import com.stinger.restfulapi.entity.Local;
import com.stinger.restfulapi.error.LocalNotFoundException;

import java.util.List;
import java.util.Optional;

public interface LocalService {
    List<Local> findAllLocals();
    Local saveLocal(Local local);
    Local updateLocal(Long id, Local local);
    void deleteLocal(Long id);
    Optional<Local> findLocalByNameIgnoreCase(String name);
    Local findLocalById(Long id) throws LocalNotFoundException;
}
