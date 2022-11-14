package com.example.baikt1;

public class casi {
    private String Ten;
    private String Nghedanh;
    private int Hinh;
    private int Quocgia;

    public casi(String ten, String nghedanh, int hinh, int quocgia) {
        Ten = ten;
        Nghedanh = nghedanh;
        Hinh = hinh;
        Quocgia = quocgia;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getNghedanh() {
        return Nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        Nghedanh = nghedanh;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public int getQuocgia() {
        return Quocgia;
    }

    public void setQuocgia(int quocgia) {
        Quocgia = quocgia;
    }
}
