package ejb30;

import javax.ejb.EJB;

public class SlessAppClient {

    @EJB
    private static Sless sless;

    public static void main(String args[]) {

        System.out.println("Sless bean says : " + sless.hello());

    }

}
