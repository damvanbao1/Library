import entity.Reader;

import java.util.Scanner;

public class Main {
    private static Reader[] readers =new Reader[100];
    public static void main(String[] args) {
        while (true){
            printMenu();
            int functionChoice = functionChoice();
            switch (functionChoice){
                case 1:
                    inputReader();
                    break;
                case 2:
                    showReader();
                    break;
                case 3:
                    break;
                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    return;

            }
        }
    }

    private static void showReader() {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i]!=null);{
                System.out.println(readers[i]);
            }
        }
    }

    private static void inputReader() {
        System.out.println("co bao nhieu ban them moi");
        int readerNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < readerNum; i++) {
            System.out.println("nhap thong tin ban doc thu "+(i+1));
            Reader reader=new Reader();
            reader.inputInfo();
            saveReader(reader);

        }
    }

    private static void saveReader(Reader reader) {
        for (int j = 0; j < readers.length; j++) {
            if (readers[j] == null){
                readers[j]=reader;
                break;
            }
        }
    }


    private static int functionChoice() {
        System.out.println("Xin moi chon chuc nang");
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice>=1 && functionChoice<=9){
                break;
            }
            System.out.println("xin moi chon lai");
        }while (true);
        return functionChoice;
    }

    private static void printMenu() {
        System.out.println("----Phan mem  quan ly sach----");
        System.out.println("1. Nhap ban doc moi");
        System.out.println("2. In danh sach ban doc");
        System.out.println("3. Nhap sach moi");
        System.out.println("4. In danh sach cac cuon sach");
        System.out.println("5. Lap bang muon sach");
        System.out.println("6. In danh sach muon sach");
        System.out.println("7. Sap xep danh sach muon");
        System.out.println("8. Tim kiem sach muon");
        System.out.println("9. Thoat");
    }
}
