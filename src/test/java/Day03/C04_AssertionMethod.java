package Day03;

import org.junit.Assert;
import org.junit.Test;

public class C04_AssertionMethod {
    @Test
    public void assertEqualsTest(){
        // 2 parametre alirsa parametreler karsilastirilir ve esitlerse test passed olur esit degilse AssertionError firlatilir
        Assert.assertEquals(1,1);
    }

    @Test
    public void assertTrueTest(){
        // 1 parametre alir ve gonderilen parametrenin true olmasi durumunda testimiz passed false olmasi durumnda failed olur
        Assert.assertTrue(true);
    }

    @Test
        public void assertFalseTest(){
        // 1 parametre alir ve gonderilen parametrenin true olmasi durumunda testimiz failed false olmasi durumnda passed olur
        Assert.assertFalse(false);
    }

    @Test
    public void assertNullTest(){
        //Bir parametre alir. Parametre null ise test passed, null degil ise test failed olur
        Assert.assertNull(null);
    }

    @Test
    public void assertNotNullTest(){
        //Bir parametre alir. Parametre null degil ise test passed, null ise test failed olur
        Assert.assertNotNull(5);
    }

    @Test
    public void assertSameTest(){
        // Obje kontrolu deger ve adresler!!!!! ayni olmalidir

        Assert.assertSame("Karl", "Karl");

    }

    @Test
    public void assertNotSameTest(){
        // Obje kontrolu deger ve adresler!!!!! ayni olmalidir
        Assert.assertNotSame("Karl", "Karl");
    }

    @Test
    public void assertArrayEquals(){

        // 2 parametre alir ve verilen arraylarin uzunluklari ve ayni indexteki elementleri ayni olmalidir.

        int[] arr1 = {1,2,3,4,5}, arr2 = {1,2,3,4,5};

        Assert.assertArrayEquals(arr1,arr2);
    }

    @Test
    public void assertEqualsWithMessage(){

        Assert.assertEquals("Bu degerler esit degil!!!", 1,5);
    }

}
