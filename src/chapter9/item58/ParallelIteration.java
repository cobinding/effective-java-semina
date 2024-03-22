package chapter9.item58;

import java.util.ArrayList;
import java.util.List;

public class ParallelIteration {

    public static class Element {
        private String element;

        public Element(String element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return "Element is " + element;
        }
    }

    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();

        elements.add(new Element("e1"));
        elements.add(new Element("e2"));
        elements.add(new Element("e3"));

        List<String> descriptions = new ArrayList<>();
        descriptions.add("설명1");
        descriptions.add("설명2");
        descriptions.add("설명3");

        // 병렬 반복을 위한 인덱스 기반 for문
        for (int i = 0; i < elements.size(); i++) {
            Element element = elements.get(i);
            String description = descriptions.get(i);

            System.out.println(element + ": " + description);
        }

        System.out.println(1.00 - 9 * 0.10);
    }

}
