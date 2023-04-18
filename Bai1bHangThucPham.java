/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlap1;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Bai1bHangThucPham {
    String maHang, tenHang, ghiChu;
    double donGia;
    LocalDate ngaySanXuat, ngayHetHan;

    public Bai1bHangThucPham() {
    }

    public Bai1bHangThucPham(String maHang, String tenHang, String ghiChu, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.ghiChu = ghiChu;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public String getMaHang() {
        int i;
        for(i=001;i<10;i++) {
            maHang="i";
        }
        return maHang;
    }
    
    public void setMaHang(String maHang) throws Exception {
        if (!maHang.trim().equals("")) { this.maHang = maHang; }
        else { throw new Exception("Lỗi: mã hàng rỗng !!!"); }
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if(tenHang=="") { tenHang="xxx"; }
        else {this.tenHang = tenHang;}
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if(donGia<0) { System.out.println("Lỗi: đơn giá không được bé hơn 0 !!!"); }
        else { this.donGia = donGia; }
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    public boolean hetHan() {
        return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    Scanner sc = new Scanner(System.in);

    
    int nhap() {
        System.out.println("Nhập tên hàng: "); tenHang=sc.nextLine();
        System.out.println("Nhập đơn giá: "); donGia=sc.nextDouble();
            do {
            if(donGia<0) { System.out.println("Lỗi: đơn giá không được bé hơn 0 !!!");} 
            return nhap();
            }while(donGia<0);
    }
    
    void xuat() {
        System.out.print("\t\n");
        System.out.println(getMaHang()+"\t"+getTenHang()+"\t\t"+getDonGia()+"\t"+getNgaySanXuat()+"\t"+getNgayHetHan());
    }
    
    
    DecimalFormat df = new DecimalFormat("#,###.00");
    LocalDate ngay = LocalDate.of(2023, 04, 18);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String sngay = dtf.format(ngay); 
}