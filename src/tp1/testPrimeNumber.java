package tp1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class testPrimeNumber {
    @RunWith(Parameterized.class)
    public class PrimeNumberCheckerTest {
        private Integer numeroEntree;
        private Boolean resultatAttendu;
        private PrimeNumberChecker primeNumberChecker;
        @Before
        public void initialize() {
            primeNumberChecker = new PrimeNumberChecker();
        }
        // Chaque paramètre doit être placé comme un argument ici.
// Chaque fois que le runner se déclenche, il passe les arguments
// à partir des paramètres définis dans la méthode primeNumbers().
        public PrimeNumberCheckerTest(Integer numeroEntree,
                                      Boolean resultatAttendu) {
            this.numeroEntree = numeroEntree;
            this.resultatAttendu = resultatAttendu;
        }
        @Parameterized.Parameters
        public static Collection primeNumbers() {
            return Arrays.asList(new Object[][] {
                    { 2, true },
                    { 6, false },
                    { 19, true },
                    { 22, false },
                    { 23, true },
                    { 73, true },
                    { 121, false }
            });
        }
        // Ce test sera exécuté 7 fois puisque nous avons 7 paramètres définis.
        @Test
        public void testPrimeNumberChecker() {
            System.out.println("Nombre paramétré est : " + numeroEntree);
            assertEquals(resultatAttendu,
                    primeNumberChecker.validate(numeroEntree));
        }
    }
}
