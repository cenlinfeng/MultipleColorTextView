package com.haosheng.multiplecolortextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import multiple_color_text_view.ColorClickListener;
import multiple_color_text_view.Entity;
import multiple_color_text_view.MultipleColorTextView;

public class MainActivity extends AppCompatActivity {
    
    //compile 'com.github.cenlinfeng:MultipleColorTextView:v1.0'
    
    /***
     * allprojects {
     repositories {
     ...
     maven { url 'https://jitpack.io' }
     }
     }
     * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Entity> list = new ArrayList<>();
        list.add(new Entity("你好1,", "#00ff00", new ColorClickListener() {
            @Override
            public void clickListener() {
                Toast.makeText(MainActivity.this, "你好1", Toast.LENGTH_SHORT).show();
            }
        }));
        list.add(new Entity("你好2,", "#ff0000", new ColorClickListener() {
            @Override
            public void clickListener() {
                Toast.makeText(MainActivity.this, "你好2", Toast.LENGTH_SHORT).show();
            }
        }));
        list.add(new Entity("你好3,", "#0000ff", new ColorClickListener() {
            @Override
            public void clickListener() {
                Toast.makeText(MainActivity.this, "你好3", Toast.LENGTH_SHORT).show();
            }
        }));
        list.add(new Entity("你好4,", "#0f0f0f", new ColorClickListener() {
            @Override
            public void clickListener() {
                Toast.makeText(MainActivity.this, "你好4", Toast.LENGTH_SHORT).show();
            }
        }));
        list.add(new Entity("你好5,", "#f0f0f0", new ColorClickListener() {
            @Override
            public void clickListener() {
                Toast.makeText(MainActivity.this, "你好5", Toast.LENGTH_SHORT).show();
            }
        }));
        list.add(new Entity("你好6,", "#f00f00", new ColorClickListener() {
            @Override
            public void clickListener() {
                Toast.makeText(MainActivity.this, "你好6", Toast.LENGTH_SHORT).show();
            }
        }));
        list.add(new Entity("你好7,", "#00f00f", new ColorClickListener() {
            @Override
            public void clickListener() {
                Toast.makeText(MainActivity.this, "你好7", Toast.LENGTH_SHORT).show();
            }
        }));
        list.add(new Entity("你好8,", "#f0f000", new ColorClickListener() {
            @Override
            public void clickListener() {
                Toast.makeText(MainActivity.this, "你好8", Toast.LENGTH_SHORT).show();
            }
        }));
        list.add(new Entity("你好9,", "#00fff0", new ColorClickListener() {
            @Override
            public void clickListener() {
                Toast.makeText(MainActivity.this, "你好9", Toast.LENGTH_SHORT).show();
            }
        }));
        list.add(new Entity("你好10,", "#ffff00", new ColorClickListener() {
            @Override
            public void clickListener() {
                Toast.makeText(MainActivity.this, "你好10", Toast.LENGTH_SHORT).show();
            }
        }));
        
        MultipleColorTextView textView = (MultipleColorTextView) findViewById(R.id.textView);
        textView.setTextAndColor(list);
    }
}
