package OOP;

public class OOPMainClass {

    public static void main(String[] args) {
        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a REFERENCE data type

        // Non-static invoking
        OOPCatClass cat1 = new OOPCatClass("John", "J", 6);

        System.out.println(cat1.name);
        System.out.println(cat1.nickname);
        System.out.println(cat1.age);
        cat1.isEating();

        System.out.println("-------------------------------------");

        OOPCatClass cat2 = new OOPCatClass("Lucy", "L", 3);

        System.out.println(cat2.name);
        System.out.println(cat2.nickname);
        System.out.println(cat2.age);
        cat2.isEating();

        System.out.println("-------------------------------------");

        OOPCatClass cat3 = new OOPCatClass("Karen");
        System.out.println(cat3.name);
        System.out.println(cat3.nickname);
        System.out.println(cat3.age);


        // Static invoking
        System.out.println(OOPCatClass.isCat);


        // Array of Objects
        System.out.println("-------------------------------------");
        System.out.println("Array of Cats:");

        OOPCatClass[] cats = {cat1, cat2, cat3};

        OOPCatClass[] cats2 = {new OOPCatClass("Cicy"),
                               new OOPCatClass("Vlad"),
                               new OOPCatClass("Opal")};

        for (OOPCatClass cat : cats)
            cat.isEating();

        System.out.println("-------------------------------\nNew Array of Cats:");
        for (OOPCatClass cat : cats2){
            cat.age = 3; // All cats now have age of 3
            cat.isEating();
            System.out.println(cat.age);
        }

    }
}
