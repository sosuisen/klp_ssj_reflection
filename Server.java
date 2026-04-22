public class Server {
    private String host;

    public Server(String host) {
        this.host = host;
        System.out.println("Server object is created");
    }

    public void start() {
        System.out.println(host + " is starting...");
    }
}
