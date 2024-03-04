package JavaStart;

public class While {
    public static void main(String[] args) {
//
//        int i = 2;// счетчик
//        int result = 1;// результат
        // в цикле while есть только одна секция проверки либо не выполнения цикла

//         while (i <= 5){
//             result = result + i;
//            if (result % 2 == 0) {
//                System.out.println("Число " + result + " является четным");
//            }else {
//                System.out.println("Число " + result + " является нечетным");
//            }
//            i++;// инкремент
//         }
//        System.out.println("1 + 2 + 3 + 4 + 5 = " + result);
        int i = 2;// счетчик
        int result = 1;// результат
         do {
             result = result + i;
            if (result % 2 == 0) {
                System.out.println("Число " + result + " является четным");
            }else {
                System.out.println("Число " + result + " является нечетным");
            }
            i++;// инкремент
         }while (i <= 5);
        System.out.println("1 + 2 + 3 + 4 + 5 = " + result);

        }
}