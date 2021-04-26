import org.junit.Assert;
public class UserTest {

    /*WHAT DOES EXACTLY THE FOLLOWING TEST UNIT DO*/

    //It has an array which covers all instruments name

    //It has a test array which has not the same index length but not the same value

    //It will check whether the values provided in resultInstruments are matching with the original expectedInstruments array

    //The test will fail till the expectedInstruments and resultInstruments are identical

    //With following two arrays, every test case for each individual instrument in the list is covered

    //To see whether the test passes, please change the "forTest" to "accordion" and see the result in console

    @org.junit.Test
    public void assertArrayEquals() {
        String[] expectedInstruments = {"accordion", "drums", "electric guitare", "guitare", "piano", "saxophone", "triangle", "trumpet"};
        String[] resultInstrumets = {"forTest", "drums", "electric guitare", "guitare", "piano", "saxophone", "triangle", "trumpet"};
        Assert.assertArrayEquals(expectedInstruments, resultInstrumets);

    }
}





