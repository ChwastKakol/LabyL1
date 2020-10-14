public class Foo {

    private Bar _bar = new Bar();

    public void foo(){
        System.out.println("Foooooo");
    }

    public void goo() {System.out.println("Goo");}

    public void bar(){
        _bar.bar();
    }
}
