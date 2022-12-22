package ru.netology.sqr;

public class SQRService {
    public int calcTheNumberOfSQR (int limitMin, int limitMax) {
        int theNumberOfSQR = 0;

        for (int i = 10; i <= 99; i++) {

            if (i * i > limitMax) {
                return theNumberOfSQR;
            }
            if (i * i >= limitMin) {
                theNumberOfSQR = theNumberOfSQR + 1;
            }
            if (i == 99){
                return theNumberOfSQR;
            }
        }
        return -1;
    }
}
