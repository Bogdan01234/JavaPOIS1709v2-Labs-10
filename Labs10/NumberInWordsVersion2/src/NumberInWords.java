public class NumberInWords {

    public static String getNumber(int number){
        String samplesInWords;

        String[] sex = {"","один","два","три","четыре","пять","шесть","семь","восемь","девять"};
        String[] str100= {"","сто","двести","триста","четыреста","пятьсот","шестьсот","семьсот", "восемьсот","девятьсот"};
        String[] str11 = {"десять","одиннадцать","двенадцать","тринадцать","четырнадцать", "пятнадцать","шестнадцать","семнадцать","восемнадцать","девятнадцать","двадцать"};
        String[] str10 = {"","десять","двадцать","тридцать","сорок","пятьдесят","шестьдесят", "семьдесят","восемьдесят","девяносто"};

        if (number == 0){
            samplesInWords = "ноль";
        }else if (number > 0 && number < 10){
            samplesInWords = sex[number];
        } else if (number >= 10 && number < 20){
            samplesInWords = str11[number - 10];
        } else if (number >= 20 && number < 100){
            samplesInWords = str10[number / 10] + " " + sex[number % 10];
        } else if (number % 100 >= 10 && number % 100 < 20){
            samplesInWords = str100[number / 100] + " " + str11[number % 100 % 10];
        } else if (number >= 100 && number <= 1000){
            samplesInWords = str100[number / 100] + " " + str10[number % 100 / 10] + " " + sex[number % 100 % 10];
        } else {
            samplesInWords = "Invalid value";
        }
        return samplesInWords;
    }
}
