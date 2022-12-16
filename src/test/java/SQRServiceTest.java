import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/limits.csv")

    public void testSQRService (int expected, int limitMin, int limitMax){
        SQRService service = new SQRService();
        int actual = service.calcTheNumberOfSQR(limitMin, limitMax);
        Assertions.assertEquals(expected, actual);

    }
}
