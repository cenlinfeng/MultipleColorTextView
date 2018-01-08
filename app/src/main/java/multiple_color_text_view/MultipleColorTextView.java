package multiple_color_text_view;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;

import java.util.List;

/**
 * Created by Admin on 2018/1/8.
 */

public class MultipleColorTextView extends android.support.v7.widget.AppCompatTextView {
    
    public MultipleColorTextView(Context context) {
        this(context, null);
    }
    
    public MultipleColorTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }
    
    public MultipleColorTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    
    public void setTextAndColor(List<Entity> textAndColor) {
        String str = "";
        for (int i = 0; i < textAndColor.size(); i++) {
            str += textAndColor.get(i).getText();
        }
        SpannableStringBuilder builder = new SpannableStringBuilder(str);
        int length = 0;
        for (int i = 0; i < textAndColor.size(); i++) {
            ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.parseColor(textAndColor.get(i).getColor()));
            builder.setSpan(colorSpan,
                    length == 0 ? 0 : length - 1,
                    length + textAndColor.get(i).getText().length(),
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            length += textAndColor.get(i).getText().length();
        }
        setText(builder);
        
    }
}
