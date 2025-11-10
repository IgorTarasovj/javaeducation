import org.junit.jupiter.api.*;

public class JUnitExamples {


    @BeforeAll
    static void beforeAllPrintTest() {
        System.out.println("beforeAll");
    }

    @BeforeEach
    void beforeEachPrintTest() {
        System.out.println("    beforeEach");
    }

    @Test
    void printTest1() {
        System.out.println("        Test1");
    }


    @Test
    void printTest2() {
        System.out.println("        Test2");
    }

    @AfterEach
    void afterEachPrintTest() {
        System.out.println("    AfterEach");
    }

    @AfterAll
    static void afterAllPrintTest() {
        System.out.println("AfterAll");
    }
}
