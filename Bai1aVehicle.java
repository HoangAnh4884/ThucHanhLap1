/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlap1;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Bai1aVehicle {
        String tenChuXe, loaiXe;
        int dungTich;
        double triGia, thuePhaiNop;

    public Bai1aVehicle() {
    }

    public Bai1aVehicle(String tenChuXe, String loaiXe, int dungTich, double triGia, double thuePhaiNop) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.thuePhaiNop = thuePhaiNop;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double getThuePhaiNop() {
        if(dungTich<100)                    {thuePhaiNop=(triGia/100);}
        if(dungTich>=100&&dungTich<200)     {thuePhaiNop=3*(triGia/100);}
        if(dungTich>=200)                   {thuePhaiNop=5*(triGia/100);}
        return thuePhaiNop;
    }
    
    Scanner sc = new Scanner(System.in);

    void nhap() {
        System.out.println("Nhập tên chủ xe: "); tenChuXe=sc.nextLine();
        System.out.println("Nhập loại xe: "); loaiXe=sc.nextLine();
        System.out.println("Nhập dung tích xe: "); dungTich=sc.nextInt();
        System.out.println("Nhập trị giá xe: "); triGia=sc.nextDouble();
    }
    
    void xuat() {
        System.out.print("\t\n");
        System.out.println(getTenChuXe()+"\t\t"+getLoaiXe()+"\t\t"+getDungTich()+"\t\t"+getTriGia()+"\t\t\t"+getThuePhaiNop());
    }
}