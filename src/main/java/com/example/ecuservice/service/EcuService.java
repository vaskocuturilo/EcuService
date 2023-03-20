package com.example.ecuservice.service;

import com.example.ecuservice.model.EcuEntity;

import java.util.Collection;

public interface EcuService {
    EcuEntity createEcu(EcuEntity ecuEntity);

    Collection<EcuEntity> getAllEcus();

    EcuEntity checkConnectionEcu(String ecuName);

    EcuEntity getEcu(Long id);

    EcuEntity update(EcuEntity ecuEntity);

    Boolean deleteEcu(Long id);
}
