import java.sql.SQLOutput;
import java.util.Arrays;
public class HW3 {
    public static void main(String[] args) {
        double[] fractional ={1.5, 2.4, 5.3, -2.5, 4.1, 6.1, 7.4, -1.8,
                8.1, 7.4, -5.9, 7.5, 6.2, 4.6, 9.9};
        double sam = 0;
        int count = 0;
        boolean findFirsNegotiv = false;
        for (double num : fractional){
            if (num < 0){
                findFirsNegotiv = true;
            } else if (findFirsNegotiv && num >0) {
                sam += num;
                count++;
            }
        }
        double totalAmount  = sam / count;
        if (findFirsNegotiv=false){
            System.out.println("В массиве нет отрицательных чиссел");
        }
        else {
            System.out.println("среднее арифмитическое "+totalAmount);
            System.out.println("сумма "+sam);
            System.out.println("количество чисел "+count);
        }
    }
}
