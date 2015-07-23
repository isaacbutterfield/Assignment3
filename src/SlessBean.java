package ejb30;

import javax.ejb.Stateless;

@Stateless
public class SlessBean implements Sless {

    public String hello() {
        return "hello, world!\n";
    }

}
