package com.j33.thinkDataStructure;


import java.util.LinkedList;
import java.util.List;

/******** Interface에 대해서 *******************************************
 * public interface Comparable<T> {
 *     public int compare(T o);
 * }
 *
 * 이 interface는 타입 파라미터인 T를 사용하여 Comparable이라는 제네릭 타입을 정의합니다.
 * 이 interface를 구현하려면 클래스는 다음과 같아야 합니다.
 * - T 타입을 명시해야 합니다.
 * - T 타입의 객체를 인자로 받고 int를 반환하는 compareTo() 메서드를 제공해야 합니다
 * - 예를 들어, java.lang.Integer 클래스의 소스 코드는 다음과 같습니다.
 *
 * public final class integer extends Number implements Comparable<Integer> {
 *     Public int compareTo(Integer anotherInteger) {
 *         int thisVal = this.value;
 *         int anothjerVal = anotherInteger.value;
 *         return (thisVal<anotherBal ? -1 : (thisVal==anotherVal ? 0 : 1));
 *     }
 *     // 다른 메서드 생략
 *
 *
 *  1.3 List interface
 *  JCF(Java Collections Framework)는 List라는 interface를 정의하고 ArrayLIst와 LinkedList라는 두 구현 클래스를 제공합니다.
 *  interface는 List가 된다는 의미가 무엇인지를 정의합니다. 이 interface를 구현하는 클래스는
 *  add, get, remove와 약 20가지 메서드를 포함한 특정 메서드 집합을 제공하야합니다.
 *  ArrayList와 LinkedList 클래스는 이러한 메서드를 제공하므로 상호교환할 수 있습니다.
 *  List로 동작하는 메서드는 ArrayList와 LinkedList 또는 List를 구현하는 어떤 객체와도 잘 동작합니다.
 *
 * */
public class ListClientExample {
    private List list;

//    유용한 동작을 하지 않지만 List를 캘슐화하는 클래스의 필수요소를 가지고 있습니다.
//    즉. List형의 인스턴스 변수를 가지고 있습니다.
    public ListClientExample() {
//    이 클래스의 생성자는 새로운 LinkedList 객체를 만들어 리스트를 초기화합니다.
//    getList 메서드는 게터 메서드로 List 객체에 대한 참조를 반환합니다.
        list = new LinkedList();
    }

    private List getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        System.out.println(list);
    }
}
