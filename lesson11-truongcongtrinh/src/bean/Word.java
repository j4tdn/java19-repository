package bean;

public class Word {
    private String word;
    private String meaning;
    private String wordType;
    private String note;

    public Word(String word, String meaning, String wordType, String note) {
        this.word = word;
        this.meaning = meaning;
        this.wordType = wordType;
        this.note = note;
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getWordType() {
        return wordType;
    }

    public String getNote() {
        return note;
    }
}
