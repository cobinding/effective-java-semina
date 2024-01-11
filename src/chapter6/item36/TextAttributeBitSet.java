package chapter6.item36;


public class TextAttributeBitSet {
    public static final int BOLD = 1 << 0; // 1
    public static final int ITALIC = 1 << 1; // 2
 //    public static final int UNDERLINE = 1 << 2; // 4
 //    public static final int STRIKE = 1 << 3; // 8

    private int style;

    public TextAttributeBitSet() {
        // 초기값이 0으로 모든 스타일을 비활성화 해둠
        this.style = 0;
    }

    // 비트 연산을 통해 값 확인
    public boolean isBold() {
        return (style & BOLD) != 0;
    }

    public boolean isItalic() {
        return (style & ITALIC) != 0;
    }

    public void setBold(boolean bold) {
        style = bold ? style | BOLD : style & ~BOLD;
    }

    public void setItalic(boolean italic) {
        style = italic ? style | ITALIC : style & ~ITALIC;
    }


    public static void main(String[] args) {
        TextAttributeBitSet textAttribute = new TextAttributeBitSet();

        textAttribute.setBold(true);
        textAttribute.setItalic(false);

        System.out.println("textAttribute is Bold = " + textAttribute.isBold());
        System.out.println("textAttribute is Italic = " + textAttribute.isItalic());
    }
}
