package day16;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C02_WriteExcel {

    @Test
    public void writeExcelTest() throws IOException {
        String path = "src/test/java/resources/Capitals.xlsx";
//    WORKBOOK (EXCEL DOSYASI) > WORKSHEET/SHEET(SAYFA) >ROW (SATIR)> CELL(VERI HUCRESI)
//        String path ="./src/test/java/resources/Capitals.xlsx";
//        String path =".\\src\\test\\java\\resources\\Capitals.xlsx";//WINDOWS
//        DOSYAYI AC
        FileInputStream fileInputStream = new FileInputStream(path);
//        EXCEL DOSYASINI AC /WORKBOOK AC
        Workbook workbook = WorkbookFactory.create(fileInputStream);
//        SAYFAYI AC / Sheet1
//        Sheet sheet1 = workbook.getSheetAt(0);//index 0 dan baslar. ilk sayfayi ac
        Sheet sheet1 = workbook.getSheet("Sheet1");// Sheet1 isimli sayfayi ac
//        ILK SATIRA GIT / Row
        Row row1 = sheet1.getRow(0);//ILK SATIRA GIT

        // ILK SATIR 3. SUTUN U CREATE ET
        Cell cell3 = row1.createCell(2);

        //NUFUS YAZDIR
        cell3.setCellValue("NUFUS");

        //KAYDET
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);

        /*
        Excel Okuma
        Excelden veriyi okumak icin hangi sırayla gitmem gerekir
        workbook > sheet > row > cell
        Bir exceldeki top satir sayısı nasıl bulunur?
        getLastROwNumber
        Yada
        getPhysicalNumberOfRows- toplam kullanılan satir sayısı
        Excel Yazdırma
        Microsoft dosyalari ile iletişime gecmek icin apache poi dependency’s kullanılır
        Su anki projende exceli nasil kullandin?
        Test caselerimde çeşitli datalar kullanıyorum. Ornegin kullanıcı adi, kullanıcı şifresi gibi dataları excelde tutuyoruz.
        Bu datalari test caselerde kullanmak icin excelden çekiyorum ve test caselerimde kullanıyorum.
        Datalari excelde tutmanı faydası, dataların derli toplu bir yerde olması, data güvenliği, data kayıplarına engel olmak.
         */

    }
}
