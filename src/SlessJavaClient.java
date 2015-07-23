package ejb30;

import javax.naming.InitialContext;

public class SlessJavaClient {

    public static void main(String args[]) {

        try {

            InitialContext ic = new InitialContext();
            Sless sless = (Sless) ic.lookup("ejb30.Sless");
            System.out.println("Sless bean says : " + sless.hello());

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
