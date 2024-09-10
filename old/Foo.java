public class Foo{
   /* int i;
    static int s;
//static - not instanced, s will increment, i is instanced
    public static void main(String[] args){
        Foo f1 = new Foo();
        System.out.println(f1.i + "" + f1.s);
          Foo f2 = new Foo();
        System.out.println(f2.i + "" + f2.s);
          Foo f3 = new Foo();
        System.out.println(f3.i + "" + f3.s);
    }

    
public Foo(){
    i++;
    s++;
}

}
*/

    static int i = 0;
    static int j = 0;
    public static void main(String[] args){
        int i = 2;
        int k = 3;
        k = i + j;
        {
            int j = 3;
            System.out.println(i+j);
        }
        System.out.println(k);
        System.out.println(j);
    }
}
