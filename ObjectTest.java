class Phone {
String brand;
String size;
void Done() {
System.out.println("Done introducing");
}
}
public class ObjectTest {
public static void main(String [] args) {
Phone one = new Phone();
one.brand = "oneplus";
one.size = "big";
one.Done();
}
}
