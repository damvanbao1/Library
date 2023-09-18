package entity;

import java.util.List;

public class QLMS {
    Books books = new Books();

    public void traSach(){
        if (soLuongDaMuon>0){
            soLuongDaMuon--;
        }
    }
    public void muonSach() {
        if (soLuongDaMuon < soLuong) {
            soLuongDaMuon++;
        }
    }



}
