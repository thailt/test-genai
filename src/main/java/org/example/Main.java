package org.example;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.0-flash",
                        """
                                Giải thích Spring Security architect, 
                                viết guide để thực hành spring security web bao gồm web k có security, 
                                nâng câp lên sping  security và các kỹ thuật advance khác
                                """,
                        null);

        System.out.println(response.text());
    }
}