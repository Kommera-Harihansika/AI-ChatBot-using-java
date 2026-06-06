package chatbot.nlp;

public class NLPProcessor {

    public String preprocess(String text) {

        text = text.toLowerCase();

        text = text.replaceAll("[^a-zA-Z ]", "");

        return text.trim();
    }
}