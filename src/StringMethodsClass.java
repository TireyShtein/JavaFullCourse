public class StringMethodsClass {

    public static void main(String[] args) {


        String sentence = "Man, that is so cool";
        String sentence2 = "Another sentence";
        String sentence3 = "man, that Is so cool";

        //System.out.println(sentence.hashCode()); // hashCode of variable

        int length = sentence.length();
        char letter = sentence.charAt(4); // ,
        int index = sentence.indexOf(" ");
        int lastIndex = sentence.lastIndexOf("a");

        //sentence = sentence.toLowerCase(); // man, that is so cool
        //sentence = sentence.toUpperCase(); // MAN, THAT IS SO COOL
        //sentence = sentence.trim();
        //sentence = sentence.replace("o", "i"); // Man, that is si ciil

        System.out.println(sentence);

        if (sentence.isEmpty())
            System.out.println("Your sentence is empty");
        else
            System.out.println("Your sentence: " + sentence);


        if (sentence.contains(" "))
            System.out.println("Sentence contains spaces");
        else System.out.println("Sentence DOESN'T contain spaces");

        if (sentence.equals(sentence2))
            System.out.println("Sentences are equal / identical");
        else System.out.println("Sentences are not equal");

        if (sentence.equalsIgnoreCase(sentence3)) // ignores cases of characters in String
            System.out.println("Sentences are IDENTICAL");
        else System.out.println("Sentences ARE NOT IDENTICAL");
    }
}
