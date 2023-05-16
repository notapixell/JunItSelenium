package Day03;

import org.junit.Assert;
import org.junit.Test;

public class C03_Assertions {

    public int divide(int a, int b) {
        return a / b;
    }
    // divide diye bir fonksiyon var. 2 parametre alır ilk parametreyi ikinciye böler. bunu test edermisin?

    // Seneryo 1--> birbirine tam bölünen iki sayı methodta sağlanırsa çıktı bölümleri olmalıdır. örn (10,2)=5

    // Seneryo 2--> birbirine tam bölünmeyen iki sayı methodta sağlanırsa çıktı ne olacak? örn (5,2)=2,5

    // Seneryo 3--> ikinci sayı 0 sağlandığında method -1 dönmeli. örn (9,0)= -1

    @Test
    public void senaryo1() {
        int expected = 5;
        int actual = divide(10, 2);

        // Assert.assertEquals metodu içerisine gönderilen 2 değerin eşitliğini kontrol eder.
        // değerler eşit değilse AssertionError fırlatır.
        Assert.assertEquals(expected, actual);

        // expected == actual ?

    }

    @Test
    public void senaryo2() {
        double expected = 2.5;
        double actual = divide(5, 2);
// Assert.assertTrue methodu içersine gönderilen boolean ifade true olursa test passed olur. false olursa test failed olur.

        Assert.assertEquals(expected, actual, 0.0);

    }
//    @Test
//    public void senaryo3 () {
//
//        int expected =-1;
//        int actual = divide(9,0);
//    }


}
