package by.epam.homework.task2;


public class SecondStringByLength {

    public static void main(String[] args) {

// 	Find the second by length string in a list or array(Найти вторую по длинне строку в списке)

        String[] array = {"0004", "02", "000000009", "1", "000006", "003", "00005", "0000007", "00000008"};
        int lengthOfArray = array.length;

        String max1 = "";
        for (int i = 0; i < lengthOfArray; i++) {
            if (array[i].length() > max1.length()) {
                max1 = array[i];
            }
        }

        String max2 = "";
        for (int a = 0; a < lengthOfArray; a++) {
            if (array[a].length() < max1.length() && array[a].length() > max2.length()) {
                max2 = array[a];
            }
        }
        System.out.println("Вторая по длине строка в массиве: " + max2 + " содержит " + max2.length()+ " символов");
    }

}

