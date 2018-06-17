public class NumberInWords {

    public static String getNumber(int number){
        String samplesInWords;
        if (number == 0){
            samplesInWords = "ноль";
        }else if (number > 0 && number < 10){
            samplesInWords = getUnits(number);
        } else if (number >= 10 && number < 20){
            samplesInWords = getTeens(number - 10);
        } else if (number >= 20 && number < 100){
            samplesInWords = getDecades(number / 10) + " " + getUnits(number % 10);
        } else if (number >= 100 && number <= 1000){
            samplesInWords = getHundreds(number / 100) + " " + getDecades(number % 100 / 10) + " " + getUnits(number % 100 % 10);
        } else {
            samplesInWords = "Invalid value";
        }
        return samplesInWords;
    }

    private static String getHundreds(int number){
        switch(number){
            case 1:
                return "сто";
            case 2:
                return "двести";
            case 3:
                return "триста";
            case 4:
                return "четыреста";
            case 5:
                return "пятьсот";
            case 6:
                return "шестсот";
            case 7:
                return "семсот";
            case 8:
                return "восемсот";
            case 9:
                return "девятьсот";
            default: return null;
        }
    }

    private static String getDecades(int number){
        switch(number){
            case 1:
                return "десять";
            case 2:
                return "двадцать";
            case 3:
                return "тридцать";
            case 4:
                return "сорок";
            case 5:
                return "пятьдесят";
            case 6:
                return "шестьдесят";
            case 7:
                return "семьдесят";
            case 8:
                return "восемьдесят";
            case 9:
                return "девяносто";
            default: return null;
        }
    }

    private static String getUnits(int number){
        switch(number){
            case 1:
                return "один";
            case 2:
                return "два";
            case 3:
                return "три";
            case 4:
                return "четыре";
            case 5:
                return "пять";
            case 6:
                return "шесть";
            case 7:
                return "семь";
            case 8:
                return "восемь";
            case 9:
                return "девять";
            default: return null;
        }
    }

    private static String getTeens(int number){
        String s = "";
        switch(number){
            case 1:
                s = "один"; break;
            case 2:
                s = "две"; break;
            case 3:
                s = "три"; break;
            case 4:
                s = "четыр"; break;
            case 5:
                s = "пят"; break;
            case 6:
                s = "шест"; break;
            case 7:
                s = "сем"; break;
            case 8:
                s = "восем"; break;
            case 9:
                s = "девят"; break;
        }
        return s + "надцать";
    }
}
