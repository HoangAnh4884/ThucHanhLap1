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

        // Bài chưa xong, thiếu, lỗi nhập,vv...

public class Bai1b {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Bai1bQuanLy ql = new Bai1bQuanLy();
        Bai1bHangThucPham tp = new Bai1bHangThucPham();
        
    int Chon;
    do {
        ql.menuLuaChon();
        System.out.println("Chọn chức năng: ");
        Chon=sc.nextInt();
        
        switch(Chon) {
            case 1: { ql.themDSHang(tp);                              break; }
            case 2: { ql.XuatDSHang();                                  break; }
            case 3: { System.out.println("Thoát chương trình");       break; }
            default: System.out.println("\nKhông có lựa chọn này\n"); break; 
        }
    }
    while(Chon!=3);
        System.out.println("\n\tCảm ơn bạn đã dùng chương trình này");
        System.out.println("\n\tChúc bạn một ngày tốt lành <(^w^)>");
    }
}