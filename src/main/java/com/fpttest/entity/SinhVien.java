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
public class SinhVien {
    @Id
    private String soCmnd;
    private String hoTen;
    private String email;
    private String soDt;
    private String diaChi;
}
