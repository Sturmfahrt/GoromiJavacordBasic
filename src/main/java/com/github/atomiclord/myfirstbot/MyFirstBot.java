package com.github.atomiclord.myfirstbot;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.intent.Intent;

public class MyFirstBot {
    public static void main(String[] args){
        // Log the bot in
        DiscordApi api = new DiscordApiBuilder()
                .setToken(args[0])
                .addIntents(Intent.MESSAGE_CONTENT)
                .login().join();

        // Add a listener which answers with "Pong!" if someone writes "!ping"
        api.addMessageCreateListener(event -> {
           if (event.getMessageContent().equalsIgnoreCase("!ping")) {
               event.getChannel().sendMessage("Pong!");
           }
        });

        // Print the invite url of your bot
        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
    }
}
