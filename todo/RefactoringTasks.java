public class RefactoringTasks {
    public static void main(String... args) {
        System.out.println("Have fun!");

        // Set up IDEA to search for REFACTOR instead of TODO and FIXME

        /*
        Some hints:
        After each big refactoring, make sure that your project still compiles with gradlew test.
        Be prepared to go back a few times to previous versions.
        In production code, you would only refactor code that needs to be modified anyway.
        Refactoring can introduce bugs and change program performance or semantics in subtle ways.
         */
    }

    public static void java5Required() {
        // REFACTOR Remove all "Unnecessary boxing"
        // REFACTOR Remove all "Unnecessary unboxing"
        // REFACTOR Change StringBuffer to StringBuilder where possible
    }

    public static void java5Optional() {
        // REFACTOR Replace 'indexOf()' with 'contains()' in String
        // REFACTOR 'for' loop replaceable with 'foreach'
        // REFACTOR 'while' loop replaceable with 'foreach'
    }

    public static void java7Required() {
        // REFACTOR use diamond operator <> with generics where possible (Explicit type can be replaced with <>)
        // REFACTOR merge identical 'catch' branches in 'try' statement
        // REFACTOR use 'try with resource' instead of the old 'try finally' code (check carefully that each refactoring is correct)
        // REFACTOR 'if' replaceble with 'switch'
    }

    public static void java8Required() {
        // Part 1
        // REFACTOR replace anonymous inner classes with lambdas or method references
        // REFACTOR use List.sort() instead of Collections.sort
        // REFACTOR Loop can be replaced with Collection.removeIf()
        // REFACTOR Replace with single Map method (we won't be replacing computeIfAbsent() as it is dangerous - contention and possible livelocks)

        // Part 2
        // REFACTOR Search for the places in the code that we've marked with "REFACTORING" and improve the code by hand.
        // REFACTOR Carefully look through "Loop can be collapsed with Stream API" inspections and check if the code after the refactoring is better or worse
        // REFACTOR IDEA does not show where Java 5 for-in loops can be replaced with Java 8 forEach() and forEachOrdered() (there would be too many places and doing it automatically can be risky).  Have a look if you can find some and refactor them.  Alt+Enter is your friend
    }

    public static void java9To11Required() {
        // Only if we have time ...

        // REFACTOR Java 9: replace immutable collections with collection factory call (e.g. List.of()
        // REFACTOR Java 9: replace null check with Objects.requireNonNullElse() call where it makes sense
        // REFACTOR Java 10: Omit local variable name - but only in a few places that would make code easier to read and understand.
    }
}