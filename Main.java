import module java.base;

public class Main {

    void main() throws Exception {
        Class<?> clazz = Server.class;
        IO.println("Server class name: " + clazz.getName());

        launch(clazz);
    }

    void launch(Class<?> clazz) throws Exception {
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (var constructor : constructors) {
            IO.println("Constructor: " + constructor.getName());
        }

        Class<?>[] parameterTypes = constructors[0].getParameterTypes();
        for (var paramType : parameterTypes) {
            IO.println("Parameter type: " + paramType.getName());
        }

        Server server = (Server) constructors[0].newInstance("localhost");
        server.start();
    }
}