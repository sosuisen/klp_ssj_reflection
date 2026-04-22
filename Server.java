public class Server {
    private String host;
    private int port;

    public Server(String host, int port) {
        this.host = host;
        this.port = port;
        System.out.println("Server object is created");
    }

    public void start() {
        System.out.println(host + ":" + port + " is starting...");
    }
}
