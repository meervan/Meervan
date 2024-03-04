package JavaStart;

public class Main {
    public static void main(String[] args) {
        // просуммировать числа в диапозоне от 1-5
        /*

        */

        int sum = 1 + 2;
        boolean isEvenNumber = sum % 2 == 0;
        if (isEvenNumber == true) {
            System.out.println("Число " + sum + "  является четным");
        } else if(isEvenNumber == false){
            System.out.println("Число " + sum + " является нечетным");
        }
        int sum1 = sum + 3;
        boolean isEvenNumber1 = sum % 2 == 0;
        if (isEvenNumber1 == true) {
            System.out.println("Число " + sum1 + "  является четным");
        } else if(isEvenNumber1 == false){
            System.out.println("Число " + sum1 + " является нечетным");
        }

        int sum2 = sum1 + 4;
        boolean isEvenNumber2 = sum % 2 == 0;
        if (isEvenNumber2== true) {
            System.out.println("Число " + sum2 + "  является четным");
        } else if(isEvenNumber2 == false){
            System.out.println("Число " + sum2 + " является нечетным");
        }
        int result = sum2 + 5;
        boolean isEvenNumber3 = result % 2 == 0;
        if (isEvenNumber3 == true) {
            System.out.println("Число " + result + "  является четным");
        } else if(isEvenNumber3 == false){
            System.out.println("Число " + result + " является нечетным");
        }


        System.out.println("1 + 2 + 3 + 4 + 5 = " + result);

        // if (условие) {
//действие(-я), которые выполняются, если условие истинно;
        }
        //else if (условие) {
//действие(-я), которые выполняются, если условие истинно;
        }
       // else if (условие) {
//действие(-я), которые выполняются, если условие истинно;
        //}
        //else {
//действие(-я), которые выполняются, если условие истинно;
      //  }

   // }
//}

    /*
    * Обратите внимание, что:

    Оператор всегда начинается сос слова if, за которым всегда идут круглые скобки с условием.
    После круглых скобок никогда не ставится точка с запятой
    Для того, чтобы указать альтернативный вариант (если не выполняется, тогда...) используются слово else.
    Если условий несколько, то каждое из них будет записываться через комбинацию
    else if, после которых в круглых скобках записывается альтернативное условие.
    Последний вариант (если не то, не то и не то, то...) записывается через else без условия.*/