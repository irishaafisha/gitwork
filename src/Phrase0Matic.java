public class Phrase0Matic {
    public static void main (String[] args) {
        String[] wordListOne = {"счастливый", "любимый", "милый", "хороший", "дисциплинированный", "ласковый", "нежный", "добрый", "позитивный", "дружелюбный", "сексуальный", "динамичный"};
        String[] wordListTwo = {"трудный", "сложный", "обидчивый", "негативный", "злобный", "плохой", "вредный", "гневный", "черствый", "психованый", "роздражительный"};
        String[] wordListThree = {"трудолюбивый", "работоспособный", "красивый", "комуникабельный", "стрессоустойчив", "сильный", "чистолюбив", "своенравный", "счастливый"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Все, что нам нужно, - это" + phrase);
    }
}
