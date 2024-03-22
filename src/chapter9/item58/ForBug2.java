package chapter9.item58;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

public class ForBug2 {

    enum Face {ONE, TWO, THREE, FOUR, FIVE, SIX}

    public static void main(String[] args) {
        Collection<Face> faces = EnumSet.allOf(Face.class);
        /*
        *  정상적으로 동작하지만 복잡한 코드
        *  1:{1~6}, 2:{1~6}, 3:{1~6}, ....
        * */

        for(Iterator<Face> i = faces.iterator(); i.hasNext();) {
            Face elementI = i.next();
            for(Iterator<Face> j = faces.iterator(); j.hasNext();) {
                System.out.println(elementI + ", " + j.next());
            }
        }

        /*
        * for-each의 사용으로 코드가 깔끔해 보인다.
        * */

        for (Face faceI:faces) {
            for (Face faceJ:faces) {
                System.out.println(faceI + ", " + faceJ);
            }
        }


    }

}
