public class Server {
    private String name;

    public Server(String name) {
        this.name = name;
        System.out.println("Server object is created");
    }

    public void start() {
        System.out.println(name + " is starting...");
    }
}
