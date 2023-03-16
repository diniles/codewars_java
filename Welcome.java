/*
https://www.codewars.com/kata/577ff15ad648a14b780000e7/java
The Task
Think of a way to store the languages as a database (eg an object). The languages are listed below so you can copy and
paste!
Write a 'welcome' function that takes a parameter 'language' (always a string), and returns a greeting - if you have it
in your database. It should default to English if the language is not in the database, or in the event of an invalid
input.
The Database
english: "Welcome",
czech: "Vitejte",
danish: "Velkomst",
dutch: "Welkom",
estonian: "Tere tulemast",
finnish: "Tervetuloa",
flemish: "Welgekomen",
french: "Bienvenue",
german: "Willkommen",
irish: "Failte",
italian: "Benvenuto",
latvian: "Gaidits",
lithuanian: "Laukiamas",
polish: "Witamy",
spanish: "Bienvenido",
swedish: "Valkommen",
welsh: "Croeso"
Possible invalid inputs include:

IP_ADDRESS_INVALID - not a valid ipv4 or ipv6 ip address
IP_ADDRESS_NOT_FOUND - ip address not in the database
IP_ADDRESS_REQUIRED - no ip address was supplied
*/


import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static String greet(String language){
        // your code
        Map<String,String> greetings= new HashMap<>();
        greetings.put("english", "Welcome");
        greetings.put("czech", "Vitejte");
        greetings.put("danish", "Velkomst");
        greetings.put("dutch", "Welkom");
        greetings.put("estonian", "Tere tulemast");
        greetings.put("finnish", "Tervetuloa");
        greetings.put("flemish", "Welgekomen");
        greetings.put("french", "Bienvenue");
        greetings.put("german", "Willkommen");
        greetings.put("irish", "Failte");
        greetings.put("italian", "Benvenuto");
        greetings.put("latvian", "Gaidits");
        greetings.put("lithuanian", "Laukiamas");
        greetings.put("polish", "Witamy");
        greetings.put("spanish", "Bienvenido");
        greetings.put("swedish", "Valkommen");
        greetings.put("welsh", "Croeso");

        if (!greetings.containsKey(language)) {
            return greetings.get("english");
        } else return greetings.get(language);
    }

    public static void main(String[] args) {
        String result;
        result=greet("english");
        System.out.println(result);
        result=greet("czech");
        System.out.println(result);
        result=greet("danish");
        System.out.println(result);
        result=greet("danis");
        System.out.println(result);
    }
}