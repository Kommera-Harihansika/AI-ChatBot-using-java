

package chatbot.gui;
import chatbot.bot.ResponseGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatBotGUI extends JFrame {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    ResponseGenerator bot = new ResponseGenerator();

    public ChatBotGUI() {

        setTitle("AI Chatbot");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(chatArea);

        inputField = new JTextField();

        sendButton = new JButton("Send");

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        chatArea.append("Bot: Hello! How can I help you?\n\n");

        sendButton.addActionListener(e -> sendMessage());

        inputField.addActionListener(e -> sendMessage());

        setVisible(true);
    }

    private void sendMessage() {

        String userText = inputField.getText();

        if(userText.isEmpty())
            return;

        chatArea.append("You: " + userText + "\n");

        String response = bot.generateResponse(userText);

        chatArea.append("Bot: " + response + "\n\n");

        inputField.setText("");
    }
}