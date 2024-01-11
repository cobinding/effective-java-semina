package chapter6.item36;

import java.util.EnumSet;

public class TextAttributeEnumSet {
    public enum Style {
        BOLD,
        ITALIC,
        UNDERLINE,
        STRIKE;
    }

    private EnumSet<Style> styles;
    
    public TextAttributeEnumSet() {
        this.styles = EnumSet.noneOf(Style.class);
    }
    
    public void setStyle(Style style, boolean active) {
        if (active) {
            styles.add(style);
        } else {
            styles.remove(style);
        }
    }
    
    public boolean isStyleActive(Style style) {
        return styles.contains(style);
    }

    public static void main(String[] args) {
        TextAttributeEnumSet textAttributeEnumSet = new TextAttributeEnumSet();
        
        textAttributeEnumSet.setStyle(Style.BOLD, true);
        textAttributeEnumSet.setStyle(Style.ITALIC, false);

        System.out.println("textAttributeEnumSet.isStyleActive(Style.BOLD) = " + textAttributeEnumSet.isStyleActive(Style.BOLD));
        System.out.println("textAttributeEnumSet.isStyleActive(Style.ITALIC) = " + textAttributeEnumSet.isStyleActive(Style.ITALIC));
    }
    
}
