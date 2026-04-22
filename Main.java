import module java.base;

public class Main {

    void main() throws Exception {
        Class<?> clazz = Server.class;
        IO.println("Server class name: " + clazz.getName());

        var server = new Server("HTTP Server");
        Class<?> serverClass = server.getClass();
        IO.println("Server class name: " + serverClass.getName());
    }

}