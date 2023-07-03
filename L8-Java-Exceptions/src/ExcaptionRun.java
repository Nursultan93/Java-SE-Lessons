import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class ExcaptionRun {
    public static void main(String[] args) {

        try {
            method1();
        }catch (SQLException e){
            System.out.println("");
        }catch (IOException e){
            System.out.println("");
        }


    }


    public static void method1() throws SQLException, IOException {

    }
}
