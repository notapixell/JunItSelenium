package Day11;

import org.junit.Test;

public class C02_Files {

    @Test
    public void files() {

        // dosya ayracını gösterir : windows için '\' -> mac için '/'
        String fileSeperator = System.getProperty("file.separator");
        System.out.println("seperator = " + fileSeperator);

        // projenin contect rootu--> çalışma ortamı
        String peoject = System.getProperty("user.dir");
        System.out.println("root = " + peoject);

       // home path
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);


    }

}
