public class TestingCircleWithStaticMembers 
{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println(Circle.getNumberOfObjects());
    }
}
