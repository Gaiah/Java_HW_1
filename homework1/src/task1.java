//import java.util.Scanner;
//1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//2. n! (произведение чисел от 1 до n)

public class task1 {
    public static int triangleNumber(int num){
        int sum = 0;
        for (int i = 1; i < num + 1; i++){
            sum += i;


        }
        return sum;
    }


    public static int factorialNum(int num) {
        int product = 1;
        for (int i = 1; i < num + 1; i++){
            product *= i;
        }
        return product;
    }
}













