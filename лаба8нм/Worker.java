public interface Worker {
    default void work() {
        System.out.println("Работник выполняет работу.");
    }
}
