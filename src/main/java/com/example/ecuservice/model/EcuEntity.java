package com.example.ecuservice.model;

import com.example.ecuservice.enumiration.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Table(name = "ecu_table")
@Data
public class EcuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false)
    @NotEmpty(message = "Device id cannot be empty or null")
    private Long deviceId;
    private String name;
    private Status status;
}
