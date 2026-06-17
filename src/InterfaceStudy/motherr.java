package InterfaceStudy;

public interface motherr {
    void nature();
    void honesty();
    default void love()
    {
        System.out.println("motherr love");

    }
    static void kindness()
    {
        System.out.println("motherr kindness");
    }
}
