package com.fpttest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TotNghiep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String heTn;
    private String ngayTn;
    private String loaiTn;

    @OneToOne
    @JoinColumn(name = "so_cmnd")
    private SinhVien sinhVien;

    @OneToOne
    @JoinColumn(name = "ma_truong")
    private Truong truong;

    @OneToOne
    @JoinColumn(name = "ma_nganh")
    private Nganh nganh;
}
