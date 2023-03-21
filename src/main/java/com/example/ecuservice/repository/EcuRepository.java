package com.example.ecuservice.repository;

import com.example.ecuservice.model.EcuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcuRepository extends JpaRepository<EcuEntity, Long> {
    EcuEntity findByDeviceId(Long deviceId);
}
