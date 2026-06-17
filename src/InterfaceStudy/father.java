package InterfaceStudy;

public interface father {
    void hardwork();
    void look();
    default void love()
    {
        System.out.println("fathers love");

    }
    static void kindness()
    {
        System.out.println("fathers kindness");

    }


}
