package com.fpttest.entity;

import jakarta.persistence.Entity;
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
public class CongViec {
    @Id
    private String ngayVaoCongTy;
    private String maNganh;
    private String tenCongViec;
    private String tenCongTy;
    private String diaChiCongTy;
    private String thoiGianLamViec;

    @OneToOne
    @JoinColumn(name = "so_cmnd")
    private SinhVien sinhVien;
}
