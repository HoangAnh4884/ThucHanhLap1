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
public class Bai1aQuanLy {
    Scanner sc = new Scanner(System.in);
    
    ArrayList<Bai1aVehicle> vehi;
    
    public Bai1aQuanLy() {
        vehi = new ArrayList<>();
    }
    
    public void themDSXe(Bai1aVehicle v) {
        System.out.println("Nhập số lượng cần thêm: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println("Lần nhập thứ " +(i+1)+ ": ");
            if(v instanceof Bai1aVehicle) {
                v=new Bai1aVehicle();
                v.nhap();
            }
            vehi.add(v);
        }
    }
    
    public void XuatDSXe() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        System.out.println("Tên chủ xe \t Loại xe \t Dung tích \t Trị giá \t\t Thuế phải nộp");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        for(Bai1aVehicle x: vehi) {
            x.xuat();
        }
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    void menuLuaChon() {
        System.out.println("\n____________________Menu Lựa Chọn____________________");
        System.out.println("1: Thêm xe");
        System.out.println("2: Xuất bảng kê khai tiền thuế trước bạ của các xe");
        System.out.println("3: Thoát.");
        System.out.println("_____________________________________________________\n");
    }
}
