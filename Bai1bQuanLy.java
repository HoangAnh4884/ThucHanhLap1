/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlap1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Bai1bQuanLy {
    Scanner sc = new Scanner(System.in);
    
    ArrayList<Bai1bHangThucPham> htp;
    
    public Bai1bQuanLy() {
        htp = new ArrayList<>();
    }
    
    public void themDSHang(Bai1bHangThucPham h) {
        System.out.println("Nhập số lượng hàng cần thêm: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println("Lần nhập thứ " +(i+1)+ ": ");
            if(h instanceof Bai1bHangThucPham) {
                h=new Bai1bHangThucPham();
                h.maHang=(""+i);
                h.nhap();
            }
            htp.add(h);
        }
    }
    
    public void XuatDSHang() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        System.out.println("Mã_Hàng \t Tên_Hàng \t\t Đơn_Giá \t Ngày_Sản_Xuất \t Ngày_Hết_Hạng \t Ghi_Chú");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        for(Bai1bHangThucPham x: htp) {
            x.xuat();
        }
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
    

    void menuLuaChon() {
        System.out.println("\n____________Menu Lựa Chọn____________");
        System.out.println("1: Thêm hàng");
        System.out.println("2: Xuất bảng kê khai hàng hóa");
        System.out.println("3: Thoát.");
        System.out.println("_____________________________________\n");
    }
}
