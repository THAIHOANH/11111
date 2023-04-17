/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author thaih
 */
public class Tivi implements Serializable {
    String mativi;
    String kieumanhinh;
    String hangsanxuat;
    String ngaynhap;
    String ngayxuat;
    double kichthuoctivi;
    double dongia;
    int soluong;
    int namsanxuat;

    public Tivi() {}

    public Tivi(String mativi, String kieumanhinh,String hangsanxuat,String ngaynhap, String ngayxuat,double kichthuoctivi, double dongia, int soluong, int namsanxuat) {
        this.mativi = mativi;
        this.kieumanhinh = kieumanhinh;
        this.hangsanxuat = hangsanxuat;
        this.ngaynhap = ngaynhap;
        this.ngayxuat = ngayxuat;
        this.kichthuoctivi = kichthuoctivi;
        this.dongia = dongia;
        this.soluong = soluong;
        this.namsanxuat = namsanxuat;
    }

    public String getMativi() {
       return mativi;
    }

    public void setMativi(String mativi) {
        this.mativi = mativi;
    }

    public String getkieumanhinh() {
        return kieumanhinh;
    }

    public void setkieumahinh(String kieumanhinh) {
        this.kieumanhinh = kieumanhinh;
    }

    public double getkichthuoctivi() {
        return kichthuoctivi;
    }

    public void setkichthuoctivi(double kichthuoctivi) {
        this.kichthuoctivi = kichthuoctivi;
    }
    
    public String gethangsanxuat() {
        return hangsanxuat;
    }
    public void sethangsanxuat(String hangsanxuat){
        this.hangsanxuat = hangsanxuat;
    }

    public double getdongia() {
        return dongia;
    }

    public void setdongia(double dongia) {
        this.dongia = dongia;
    }

    public int getsoluong() {
        return soluong;
    }

    public void setsoluong(int soluong) {
        this.soluong = soluong;
    }
    public String getngaynhap(){
        return ngaynhap;
    }
    public void setngaynhap(String ngaynhap){
        this.ngaynhap = ngaynhap;
    }
    public String getngayxuat(){
        return ngayxuat;
    }
    public void setngayxuat(String ngayxuat){
        this.ngayxuat = ngayxuat;
    }
    public int getnamsanxuat(){
        return namsanxuat;
    }
    public void setnamsanxuat(int namsanxuat){
        this.namsanxuat = namsanxuat;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Nhập mã Tivi:");
        mativi = scanner.nextLine();
        System.out.println("Nhập kiểu màn hình:");
        kieumanhinh = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất:");
        hangsanxuat = scanner.nextLine();
        System.out.println("Ngày nhập: ");
        ngaynhap = scanner.nextLine();
        System.out.println("Ngày Xuất: ");
        ngayxuat = scanner.nextLine();
        System.out.println("Nhập kích thước Tivi:");
        kichthuoctivi = scanner.nextDouble();
        System.out.println("Nhập đơn giá:");
        dongia = scanner.nextDouble();
        System.out.println("Nhập số lượng:");
        soluong = scanner.nextInt();
        System.out.println("Năm sản xuất: ");
        namsanxuat = scanner.nextInt();
    
    }
       public void xuat(){
        System.out.println("{Mã Tivi : "+getMativi()+", Kiểu màn hình: "+getkieumanhinh()+", Hãng sản xuất : "+gethangsanxuat()+", ngày nhập: "+getngaynhap()+", ngày xuất: "+getngayxuat()+" ,Kích thước tivi : "+getkichthuoctivi()+", Đơn giá: "+getdongia()+", Số lượng: "+getsoluong()+", năm phát hành: "+getnamsanxuat()+"}");
       }
}

class TVOLED extends Tivi {
    public TVOLED(){
        super();
    }
    public TVOLED(String mativi, String kieumanhinh,String hangsanxuat,String ngaynhap, String ngayxuat,double kichthuoctivi,double dongia, int soluong , int namsanxuat){
        super (mativi, kieumanhinh,hangsanxuat,ngaynhap,ngayxuat,kichthuoctivi,dongia,soluong,namsanxuat);
    }
    @Override
public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã Tivi:");
        mativi = scanner.nextLine();
        System.out.println("Nhập kiểu màn hình:");
        kieumanhinh = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất:");
        hangsanxuat = scanner.nextLine();
        System.out.println("Ngày nhập: ");
        ngaynhap = scanner.nextLine();
        System.out.println("Ngày Xuất: ");
        ngayxuat = scanner.nextLine();
        System.out.println("Nhập kích thước Tivi:");
        kichthuoctivi = scanner.nextDouble();
        System.out.println("Nhập đơn giá:");
        dongia = scanner.nextDouble();
        System.out.println("Nhập số lượng:");
        soluong = scanner.nextInt();
        System.out.println("Năm Phát Hành: ");
        namsanxuat = scanner.nextInt();
    }
@Override
       public void xuat(){
                  System.out.println("{Mã Tivi : "+getMativi()+", Kiểu màn hình: "+getkieumanhinh()+", Hãng sản xuất : "+gethangsanxuat()+", ngày nhập: "+getngaynhap()+", ngày xuất: "+getngayxuat()+" ,Kích thước tivi : "+getkichthuoctivi()+", Đơn giá: "+getdongia()+", Số lượng: "+getsoluong()+", năm phát hành: "+getnamsanxuat()+"}");

       }
}

 class TV4K extends Tivi {    
    public TV4K(){
        super();
    }
    public TV4K(String mativi, String kieumanhinh,String hangsanxuat,double kichthuoctivi,double dongia, int soluong, String ngaynhap, String ngayxuat, int namsanxuat){
        super (mativi, kieumanhinh, hangsanxuat,ngaynhap, ngayxuat,kichthuoctivi,dongia, soluong, namsanxuat);
    }
    @Override
public void nhap() {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Nhập mã Tivi:");
        mativi = scanner.nextLine();
        System.out.println("Nhập kiểu màn hình:");
        kieumanhinh = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất:");
        hangsanxuat = scanner.nextLine();
        System.out.println("Ngày nhập: ");
        ngaynhap = scanner.nextLine();
        System.out.println("Ngày Xuất: ");
        ngayxuat = scanner.nextLine();
        System.out.println("Nhập kích thước Tivi:");
        kichthuoctivi = scanner.nextDouble();
        System.out.println("Nhập đơn giá:");
        dongia = scanner.nextDouble();
        System.out.println("Nhập số lượng:");
        soluong = scanner.nextInt();
        System.out.println("Năm sản xuất: ");
        namsanxuat = scanner.nextInt();
    }
@Override
       public void xuat(){
                 System.out.println("{Mã Tivi : "+getMativi()+", Kiểu màn hình: "+getkieumanhinh()+", Hãng sản xuất : "+gethangsanxuat()+", ngày nhập: "+getngaynhap()+", ngày xuất: "+getngayxuat()+" ,Kích thước tivi : "+getkichthuoctivi()+", Đơn giá: "+getdongia()+", Số lượng: "+getsoluong()+", năm phát hành: "+getnamsanxuat()+"}");

       }
}


class QuanLy {
    Scanner sc = new Scanner(System.in);
    ArrayList<Tivi>tv;
    public QuanLy(){
        tv = new ArrayList<>();
    }
    public void themDSTivi(Tivi a){
        System.out.println("Nhập số lượng cần thêm:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Lần nhập thứ "+ (i+1)+":");
            if(a instanceof TVOLED){
                a=new TVOLED();
                a.nhap();
            }
            else if (a instanceof TV4K){
                a = new TV4K();
                a.nhap();
            }
            tv.add(a);
            System.out.println("Thêm Tivi Thành Công!");
        }
    }
        public void XuatDSTVOLED() {
             if (tv.isEmpty()) {
        System.out.println("Danh sách trống.");
    } else {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(Tivi x: tv) {
            if(x instanceof TVOLED) {
                x.xuat();
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    }
    
    public void XuatDSTV4K() {
         if (tv.isEmpty()) {
        System.out.println("Danh sách trống.");
    } else {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(Tivi x: tv) {
            if(x instanceof TV4K) {
                x.xuat();
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    }
    public void menuSuaDoi(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("0: Kết Thúc");
        System.out.println("1: Sửa Thông Tin TVOLED");
        System.out.println("2: Xóa TVOLED");
        System.out.println("3: Sửa Thông Tin TV4K");
        System.out.println("4: Xóa TV4K");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Chọn chức năng: "); 
    }
    public void SuaDoi() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            menuSuaDoi();
            System.out.println("Lựa chọn ");
            n=sc.nextInt();
            switch(n) {
                case 0: System.out.println("Kết thúc sửa đổi"); break;
                case 1: {
                    String mativi;
                    System.out.println("Nhập mã TVOLED cần sửa: ");
                    sc.nextLine();
                    mativi=sc.nextLine();
                    suaTVOLED(mativi);
                    break;
                }
                case 2: {
                    String mativi;
                    System.out.println("Nhập mã TVOLED cần xóa: ");
                    sc.nextLine();
                    mativi=sc.nextLine();
                    xoaTVOLED(mativi);  
                    System.out.println("Xóa Tivi thành công.");
                    break;
                }
                case 3: {
                    String mativi;
                    System.out.println("Nhập mã TV4k cần sửa: ");
                    sc.nextLine();
                    mativi=sc.nextLine();
                    suaTV4K(mativi);
                    break;
                }
                case 4: {
                    String mativi;
                    System.out.println("Nhập mã TV4K cần xóa: ");
                    sc.nextLine();
                    mativi=sc.nextLine();
                    xoaTV4K(mativi);
                    System.out.println("Xóa Tivi thành công.");
                    break;
                }
                default: 
                    System.out.println("\nXin lỗi, Không có lựa chọn này\n"); 
                    break;
            }
        } while(n!=0);
    }
public void suaTVOLED(String mativi) {
        for(Tivi x: tv) {
            if(x instanceof TVOLED) {
                if(((TVOLED)x).getMativi().compareTo(mativi)==0) {
                    x.nhap();
                }
            }
        }
    }
    
    public void xoaTVOLED(String mativi) {
        for(Tivi x: tv) {
            if(x instanceof TVOLED) {
                if(((TVOLED)x).getMativi().compareTo(mativi)==0) {
                    tv.remove(x);
                }
            }
        }
    }
    
    public void suaTV4K(String mativi) {
        for(Tivi x: tv) {
            if(x instanceof TV4K) {
                if(((TV4K)x).getMativi().compareTo(mativi)==0) {
                    x.nhap();
                }
            }
        }
    }
    
    public void xoaTV4K(String mativi) {
        for(Tivi x: tv) {
            if(x instanceof TV4K) {
                if(((TV4K)x).getMativi().compareTo(mativi)==0) {
                    tv.remove(x);
                }
            }
        }
    }
    public void SapXepTheoDonGia()
{
     Collections.sort(tv, new Comparator<Tivi>() {
     @Override
     public int compare(Tivi t1, Tivi t2) {
            return Double.compare(t1.getdongia(), t2.getdongia());
        }
    });
       System.out.println("Danh sách tivi sau khi sắp xếp: ");
       XuatDSTVOLED();
       XuatDSTV4K();
       hien2DSTV();

}
    public void hienCacTiviSamsung() {
        if (tv.isEmpty()) {
        System.out.println("Danh sách trống.");
    } else {
         for (Tivi x : tv) {
         if (x instanceof Tivi && ((Tivi)
         x).gethangsanxuat().equalsIgnoreCase("SAM SUNG") == true) {
         x.xuat();
}
}
}
}
    public void hien2DSTV(){
         if (tv.isEmpty()) {
        System.out.println("Danh sách trống.");
    } else {
        System.out.println("Danh sách Tivi:");
        for (Tivi tivi : tv) {
            tivi.xuat();
    }
    }
    }
 
    public void menuChinh() {
System.out.println("------CHƯƠNG TRÌNH QUẢN LÝ KHO TIVI------");
System.out.println("1. Nhập danh sách TVOLED ");
System.out.println("2. Nhập danh sách TV4K");
System.out.println("3. Hiển thị danh sách TVOLED");
System.out.println("4. Hiển thị danh sách TV4K");
System.out.println("5. Chỉnh sửa thông tin (TVOLED,TV4K)");
System.out.println("6. Sắp xếp danh sách Tivi theo đơn giá ");
System.out.println("7. Thống kê các tivi Samsung ");
System.out.println("8. Hiển thị cả 2 danh sách ");
System.out.println("-----Nhấn phím 0 để thoát chương trình, xin cảm ơn!-----");
}
    
}

class Main {
    public static void main(String[] args) {
        QuanLy a= new QuanLy();
        Tivi b;
                
        int n;
       Scanner sc= new Scanner(System.in);
       do
      {
      a.menuChinh();
      System.out.print("Lựa chọn: ");
     n= sc.nextInt();
     switch(n)
    {
    case 1:
    {

     b= new TVOLED();
     a.themDSTivi(b);
   break;
    }
    case 2:
    {

   b= new TV4K();
     a.themDSTivi(b);
   break;
   }
   case 3:
    {
    a.XuatDSTVOLED();
     break;
    }
   case 4:
   {

   a.XuatDSTV4K();
   break;
    }
   case 5:
     {
   a.SuaDoi();
   break;
   }
   case 6:
       {
     System.out.println("-------------------------------");
     a.SapXepTheoDonGia();
      break;
    }
       case 7:
{
a.hienCacTiviSamsung();
break;
}
       case 8:
       {
        a.hien2DSTV();
        break;
       }
    
       
 default:
break;
    }
     
}
while(n!=0);
}
}      
