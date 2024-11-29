package com.fpttest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InputDto {
    private String soCmnd;
    private String hoTen;
    
    private String email;
    private String soDt;
    private String diaChi;
    private String maTruong;
    private String maNganh;
    private String heTotNghiep;
    private String ngayTotNghiep;
    private String loaiTotNghiep;
}
