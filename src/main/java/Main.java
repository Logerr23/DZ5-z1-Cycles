import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int SQR = service.calcTheNumberOfSQR( 9, 26);
        System.out.println(SQR);

    }
}