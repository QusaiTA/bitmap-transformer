package lab4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello");

        String inputPath = "C:\\Users\\STUDENT\\bitmap-transformer\\lib\\src\\main\\sources\\apj44-9jai2.bmp";
        String outputPath = "C:\\Users\\STUDENT\\bitmap-transformer\\lib\\src\\main\\sources\\imageAfterEdit";

        String moBlue = "FilterBlue";
        String noGreen = "FilterGreen";
        String fliphorizontally = "fliphorizontally";

        Bitmap noBlueImage = new Bitmap(inputPath,outputPath,moBlue);
        Bitmap noGreenImage = new Bitmap(inputPath,outputPath,noGreen);
        Bitmap fliphor= new Bitmap(inputPath,outputPath,fliphorizontally);

        noBlueImage.deleteBlue();



        noGreenImage.deleteGreen();
        fliphor.filpVertical();

    }
}