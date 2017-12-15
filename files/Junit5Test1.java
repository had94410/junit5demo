import org.junit.gen5.api.Test;

public class Junit5Test1 {

    @Test
    public void test1() {
        System.out.println("test1 : " + this.hashCode());
    }

    @Test
    public void test2() {
        System.out.println("test2 : " + this.hashCode());
    }
}