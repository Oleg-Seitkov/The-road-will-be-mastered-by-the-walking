public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

//        Присваиваем переменной а результат сложения a и b
        a = a + b;   //a == 15
//        Присваиваем переменной b значение разности a и b,
//        где a == изначальное значение a + b
        b = a - b;   //b == 5

//        Присваиваем переменной b значение разности a и b,
//        где a == (изначальное значение a) + b,
//        b == значальное значение a
        a = a - b;   //a == 10

        System.out.println("Значение а: " + a + ". Значение b: " + b);

    }
}
