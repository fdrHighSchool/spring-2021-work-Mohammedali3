import java.util.*;
public class Driver {
  public static void main(String[] args) {
    SuperArray array1 = new SuperArray(9);
    System.out.println(array1.isEmpty());
    array1.add(6,630);
    array1.add(2,15);
    System.out.println(array1);
    array1.growArray(4);
    array1.set(3,437);
    array1.remove(6);
    array1.remove(9);
    System.out.println(array1);
    array1.add(46);
    array1.add(34);
    array1.add(64);
    array1.add(23);
    array1.add(45);
    array1.add(98);
    array1.add(79);
    array1.add(15);
    array1.add(43);
    array1.add(98);
    array1.add(24);
    array1.add(108);
    System.out.println(array1);
  }
}
