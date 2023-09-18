package entity;

public class Books extends QLMS{
    private int maSach;
    private String tenSach;
    private int soLuong;
    private int soLuongDaMuon;

    public Books() {
        this.maSach =10000;
        maSach++;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoLuongDaMuon() {
        return soLuongDaMuon;
    }

    public void setSoLuongDaMuon(int soLuongDaMuon) {
        this.soLuongDaMuon = soLuongDaMuon;
    }

    public Books(int maSach, String tenSach, int soLuong, int soLuongDaMuon) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.soLuongDaMuon = soLuongDaMuon;
    }

    @Override
    public String toString() {
        return "Books{" +
                "maSach=" + maSach +
                ", tenSach='" + tenSach + '\'' +
                ", soLuong=" + soLuong +
                ", soLuongDaMuon=" + soLuongDaMuon +
                '}';
    }



}
