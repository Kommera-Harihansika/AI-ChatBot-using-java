package chatbot.data;

import java.util.HashMap;

public class FAQs {

    public static HashMap<String,String> getFAQMap(){

        HashMap<String,String> faq = new HashMap<>();

        faq.put("hello",
                "Hello! Nice to meet you.");

        faq.put("hi",
                "Hi there!");

        faq.put("how are you",
                "I am doing great.");

        faq.put("what is java",
                "Java is an object-oriented programming language.");

        faq.put("what is ai",
                "Artificial Intelligence enables machines to mimic human intelligence.");

        faq.put("bye",
                "Goodbye! Have a nice day.");

        return faq;
    }
}