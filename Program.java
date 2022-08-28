class Test {
  protected int a, b;
}

class Program {
  public static void main(String[] args) {
    Test scn = new Test();
    System.out.println(scn.a + " " + scn.b);
  }
}
// output : 0 0
// explanation
// In Java, a protected member is accessible in all classes of the same package and in inherited classes of other packages.
//  Since Test and Main are in the same package, no access-related problems in the above program. 
// Also, the default constructors initialize integral variables as 0 in Java 
//  (Refer to this article for more details). That is why we get output as 0 0.
