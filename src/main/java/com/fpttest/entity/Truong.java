package com.fpttest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Truong {
    @Id
    private String maTruong;
    private String tenTruong;
    private String diaChi;
    private String soDt;
}
