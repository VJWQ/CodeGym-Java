package Part1JavaSyntax.Exception;

public class TestString {
    String str = "a";   // str = 'a'

    void A() {
        try {
            str +="b";   // str = 'ab'
            B();         // goes to line 15
        } catch (Exception e) {
            str += "c";   // str = 'abdec'
        }
    }

    void B() throws Exception {
        try {
            str += "d";   // str = 'abd'
            C();          // goes to line 27
        } catch(Exception e) {
            throw new Exception();  // goes back to void A(); caught by line 10
        } finally {
            str += "e";             // str = 'abde'
        }
        str += "f";
    }

    void C() throws Exception {
        throw new Exception();      // goes back to void B(); caught by line 19
    }

    void display() {
        System.out.println(str);    // abdec
    }

    public static void main(String[] args) {
        TestString object = new TestString();
        object.A();     // goes to line 6
        object.display();
    }
}
