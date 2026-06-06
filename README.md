# AI ChatBot Using Java

## 📌 Project Overview

AI ChatBot is a Java-based desktop application that provides interactive communication between users and a chatbot. The project uses Natural Language Processing (NLP) techniques and rule-based responses to answer frequently asked questions through a graphical user interface (GUI).

This project demonstrates the basics of Artificial Intelligence, NLP, Java Swing, and chatbot development.

---

## 🚀 Features

* Interactive chat interface using Java Swing
* Rule-based chatbot responses
* Basic NLP preprocessing
* FAQ-based knowledge base
* User-friendly GUI
* Fast and lightweight application
* Easily extendable for Machine Learning integration

---

## 🛠 Technologies Used

* Java
* Java Swing
* Object-Oriented Programming (OOP)
* Natural Language Processing (NLP)
* HashMap Data Structure

---

## 📂 Project Structure

```text
AI-ChatBot
│
├── src
│   └── chatbot
│       ├── Main.java
│       ├── bot
│       │   └── ResponseGenerator.java
│       ├── data
│       │   └── FAQs.java
│       ├── gui
│       │   └── ChatBotGUI.java
│       └── nlp
│           └── NLPProcessor.java
│
└── README.md
```

---

## ⚙️ How It Works

1. User enters a message through the GUI.
2. NLP Processor cleans and preprocesses the text.
3. Response Generator checks keywords against the FAQ database.
4. Appropriate response is generated.
5. Response is displayed in the chat window.

---

## 🧠 NLP Techniques Used

* Text normalization
* Lowercase conversion
* Punctuation removal
* Keyword matching
* Intent identification using rule-based logic

---

## ▶️ How to Run

### Compile

```bash
javac -d out src/chatbot/*.java src/chatbot/bot/*.java src/chatbot/data/*.java src/chatbot/gui/*.java src/chatbot/nlp/*.java
```

### Run

```bash
java -cp out chatbot.Main
```

---

## 💬 Sample Questions

* Hello
* Hi
* How are you?
* What is Java?
* What is AI?
* Bye

---

## 📸 Output

The chatbot provides real-time responses through a desktop GUI interface.

Example:

User: What is Java?

Bot: Java is an object-oriented programming language.

---

## 🔮 Future Enhancements

* Machine Learning based intent detection
* Voice input and output
* Database integration
* Web-based chatbot deployment
* OpenNLP integration
* Chat history storage
* Sentiment analysis

---

## 🎯 Learning Outcomes

* Understanding chatbot architecture
* Applying NLP concepts
* Developing Java Swing applications
* Implementing rule-based AI systems
* Working with Java collections and OOP

---

## 👩‍💻 Author

Kommera Hari Hansika

---

## 📄 License

This project is developed for educational and learning purposes.
