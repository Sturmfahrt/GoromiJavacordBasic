# Goromi Basic Javacord Bot
## The README file
___

This is the readme file for this repo. the project was created in IntelliJ IDEA. targeted for java 17. at the current moment i am unable to get the thing into a single working jar file. i can link the dependencies in the manifest and then zip everything together, but that defeats the point of a jar file. it is intended on just demonstrating i can make a java discord bot that works. all it does is see a specific message and respond to it at the moment.

why did i use javacord, because jda, discord 4j made things harder than they needed to be. as to why this is an IntelliJ IDEA project. well, i hate eclipse, because i have had plenty of problems doing simple stuff. plus its ugly and confusing. and i simply have no desire to use netbeans, hence IntelliJ IDEA.

If you have done some snooping you will have noticed i came to a different solution than initial predicted about where the bot token would be stored. i initially thought it would have been in a config file. i ended up just having it passed as an argument. if you cant remember it make a script that launches the program with the token in the script.

i should mention the source of a singular working independent jar file is java complaining about signatures. why this keeps happening i have no idea.

___
## Setup
In order for the bot to work and not crash on startup you will need pass the token to the bot when you launch it in the form of `java -jar GoromiJavacordBasic-1.0-SNAPSHOT-fat.jar TOKEN`.