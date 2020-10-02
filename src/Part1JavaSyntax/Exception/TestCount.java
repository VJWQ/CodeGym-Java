package Part1JavaSyntax.Exception;

public class TestCount {
    int count = 0;

    void A() throws Exception
    {
        try {
            count++;    // 1
            try {
                count++;    // 2
                try {
                    count++;    // 3
                    throw new Exception();    // caught by line 15
                } catch(Exception ex) {
                    count++;    // 4
                    throw new Exception();    // caught by line 19
                }
            } catch(Exception ex) {
                throw new Exception();    // goes to line 22
            }
        } catch(Exception ex) {
            count++;    // 5
            // not throwing exception: goes to the finally block
        }finally {
            count++;    // 6
        }

    }

    void display() {
        System.out.println(count);    // count = 6
    }

    public static void main(String[] args) throws Exception {
        TestCount obj = new TestCount();
        obj.A();
        obj.display();
    }
}
