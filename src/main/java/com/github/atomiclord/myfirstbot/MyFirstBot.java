package com.github.atomiclord.myfirstbot;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.intent.Intent;

public class MyFirstBot {
    public static void main(String[] args){
        // Log the bot in
        DiscordApi api = new DiscordApiBuilder()
                .setToken("MTA2ODMwNTc2NjE1MjQxMzE4NA.G3Exf1.4lTxpo_qUEwjQW68u2TBBsAZfbr3epVgVrCECg")
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
