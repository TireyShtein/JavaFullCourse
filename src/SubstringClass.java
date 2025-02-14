public class SubstringClass {

    public static void main(String[] args) {

        // .substring() -- extracts portion of a string
        // .substring(start, end)


        String phrase = "Hey, I got you, bro";
        String meme_phrase = phrase.substring(phrase.indexOf("I")); // I got you, bro
        String part_phrase1 = phrase.substring(5, phrase.indexOf("u") + 1); // I got you
        String part_phrase2 = phrase.substring(phrase.lastIndexOf("y")); // you bro
        String part = phrase.substring(7, 10); //

        System.out.println(meme_phrase);
        System.out.println(part_phrase1);
        System.out.println(part_phrase2);

    }
}
