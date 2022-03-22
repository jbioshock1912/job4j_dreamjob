package epam.topic_one;

class Length {

    static int getLengthWord(String phrase){
        var words = phrase.split(" ");
        return words[words.length - 1].length();
    }
}
