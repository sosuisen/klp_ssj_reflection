import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    void main()
            throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> serverClass = Server.class;
        IO.println("Server class name: " + serverClass.getName());

        Constructor<?>[] constructors = serverClass.getDeclaredConstructors();
        for (var constructor : constructors) {
            IO.println("Constructor: " + constructor.getName());
        }

        Class<?>[] parameterTypes = constructors[0].getParameterTypes();
        for (var paramType : parameterTypes) {
            IO.println("Parameter type: " + paramType.getName());
        }

        Server server = (Server) constructors[0].newInstance("HTTP Server");
        server.start();
    }
}