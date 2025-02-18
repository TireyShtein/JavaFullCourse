public class AnonymousClass {

    public static void main(String[] args) {

        // Anonymous class = A class with no name. Cannot be reused.
        //                   Add custom behavior w/o having to create a new class
        //                   Often used for one time uses (TimerTask, Runnable, callbacks)

        Cat cat = new Cat();
        Cat tom = new Cat(){
            @Override
            void speak(){
                System.out.println("Tom says meow");
            }

        };

        cat.speak();
        tom.speak();
    }
}
