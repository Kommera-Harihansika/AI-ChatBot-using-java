package chatbot.bot;
import chatbot.data.FAQs;
import chatbot.nlp.NLPProcessor;

import java.util.HashMap;

public class ResponseGenerator {

    private NLPProcessor nlp = new NLPProcessor();

    private HashMap<String,String> faq = FAQs.getFAQMap();

    public String generateResponse(String userInput){

        String processed = nlp.preprocess(userInput);

        for(String key : faq.keySet()){

            if(processed.contains(key)){
                return faq.get(key);
            }
        }

        return "Sorry, I don't understand. Please ask another question.";
    }
}