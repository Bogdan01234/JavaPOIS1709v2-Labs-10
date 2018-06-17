// Программа для подсчёта голов и глаз дракона, с учётом его возраста, версия 2.0
//Лапатнёв Богдан Александрович, группа pois1709v2. 18.03.2018.

public class Controller {

    public static void main(String[] args) {
        View.print("***Название числа в виде строки***");
        while (true) {
            int numder = UserInout.input("\nВведите число от 0 до 999: ");
            View.print("\nЧисло в виде строки: " + NumberInWords.getNumber(numder));
            int numder2 = UserInout.input("\nЧтобы ввести новое число нажмите 1, чтобы завершить программу нажмите любое другое число: ");
            if (numder2 != 1){
                break;
            }
        }
    }
}
