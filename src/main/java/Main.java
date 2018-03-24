import java.io.IOException;
import java.net.Socket;
import java.sql.*;
import java.net.*;

import static spark.Spark.*;

public class Main {

    public static void main(String[] args){
        port(4460);
        get("/hello", (req, res) -> "Hello World");

        stop();
    }
}
