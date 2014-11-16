/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bill
 */
import java.io.*;

public class FileOutput {

    static int mErr;

    public static int waveToFile(String filename, byte[] byteWave) {
        FileOutputStream fOut = null;
        File file = new File(filename);

        try {
            fOut = new FileOutputStream(file);
            fOut.write(byteWave);
            fOut.close();
        } catch (IOException e) {
    // Do something
        } finally {
            if (fOut != null) {
                try{
                fOut.close();
                }
                catch (IOException e)
                {
                
                }
            }
        }

        return mErr;
    }

}
