package chapter9.item58;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Element {
    private String element;

    public Element(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Element is " + element;
    }

    public static void main(String[] args) {
        Collection<Element> collection = new ArrayList<>();
        collection.add(new Element("e1"));
        collection.add(new Element("e2"));
        collection.add(new Element("e3"));

        // 전통적인 for문을 사용한 CASE -> index를 노출한다.
        for(Iterator<Element> i = collection.iterator(); i.hasNext();) {
            Element element1 = i.next();
            System.out.println(element1.toString());
        }

        // for-each로  리팩토링
        for(Element element : collection) {
            System.out.println(element.toString());
        }
    }
}
