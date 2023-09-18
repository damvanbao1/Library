package entity;

import statics.ReaderType;

import java.util.Scanner;

public class Reader extends Person{
    private static int Auto_id=10000;

    public Reader() {
        this.id=Auto_id;
        Auto_id++;
    }

    private int id;
    private ReaderType readerType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ReaderType getReaderType() {
        return readerType;
    }

    public void setReaderType(ReaderType readerType) {
        this.readerType = readerType;
    }

    @Override
    public String toString() {
        return "entity.Reader{" +
                "id=" + id +
                ", readerType=" + readerType.value +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    public void inputInfo(){
        super.inputInfo();
        this.setPhone(new Scanner(System.in).nextLine());
        System.out.println("nhap loai ban doc, chon 1 trong cac loai sau: ");
        System.out.println("1. Sinh Vien");
        System.out.println("2. Hoc vien cao hoc");
        System.out.println("3. Giang vien");
        int type= new Scanner(System.in).nextInt();
        switch (type){
            case 1:
                this.setReaderType(ReaderType.student);
                break;
            case 2:
                this.setReaderType(ReaderType.post_student);
                break;
            case 3:
                this.setReaderType(ReaderType.teacher);
                break;

        }

    }
}
