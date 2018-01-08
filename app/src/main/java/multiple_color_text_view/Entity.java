package multiple_color_text_view;

/**
 * Created by Admin on 2018/1/8.
 */

public class Entity {
    private String text;
    private String color;
    private ColorClickListener colorClickListener;
    
    public Entity(String text, String color, ColorClickListener colorClickListener) {
        this.text = text;
        this.color = color;
        this.colorClickListener = colorClickListener;
    }
    
    public Entity(String text, String color) {
        this.text = text;
        this.color = color;
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public ColorClickListener getColorClickListener() {
        return colorClickListener;
    }
    
    public void setColorClickListener(ColorClickListener colorClickListener) {
        this.colorClickListener = colorClickListener;
    }
}
