package com.thaieasyelec.myapplication;

/**
 * Created by User on 26/10/2558.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Hashtable;


public class Font {

    public static void setFontFace(View v,int type){

        Typeface myFontBold = getFont("fonts/PspimpdeedII.ttf", Global.getAppContext());
        Typeface myFontBoldItatic = getFont("fonts/PspimpdeedII.ttf", Global.getAppContext());
        Typeface myFontNormal = getFont("fonts/PspimpdeedII.ttf", Global.getAppContext());
        Typeface myFontNormalItatic = getFont("fonts/PspimpdeedII.ttf", Global.getAppContext());

//        Typeface myFontNormal = Typeface.createFromAsset(Global.getAppContext().getAssets(), name);

        if(v instanceof TextView){
            TextView view = (TextView) v;
            switch (type){
                case 0:view.setTypeface(myFontNormal);
                    break;
                case 1:view.setTypeface(myFontNormalItatic);
                    break;
                case 2:view.setTypeface(myFontBold);
                    break;
                case 3:view.setTypeface(myFontBoldItatic);
                    break;
            }

        }else if(v instanceof EditText){
            EditText view = (EditText) v;
            switch (type){
                case 0:view.setTypeface(myFontNormal);
                    break;
                case 1:view.setTypeface(myFontNormalItatic);
                    break;
                case 2:view.setTypeface(myFontBold);
                    break;
                case 3:view.setTypeface(myFontBoldItatic);
                    break;
            }

        }else if(v instanceof Button){
            Button view = (Button) v;
            switch (type){
                case 0:view.setTypeface(myFontNormal);
                    break;
                case 1:view.setTypeface(myFontNormalItatic);
                    break;
                case 2:view.setTypeface(myFontBold);
                    break;
                case 3:view.setTypeface(myFontBoldItatic);
                    break;
            }

        }else if(v instanceof RadioButton){
            RadioButton view = (RadioButton) v;
            switch (type){
                case 0:view.setTypeface(myFontNormal);
                    break;
                case 1:view.setTypeface(myFontNormalItatic);
                    break;
                case 2:view.setTypeface(myFontBold);
                    break;
                case 3:view.setTypeface(myFontBoldItatic);
                    break;
            }

        }else if(v instanceof CheckBox){
            CheckBox view = (CheckBox) v;
            switch (type){
                case 0:view.setTypeface(myFontNormal);
                    break;
                case 1:view.setTypeface(myFontNormalItatic);
                    break;
                case 2:view.setTypeface(myFontBold);
                    break;
                case 3:view.setTypeface(myFontBoldItatic);
                    break;
            }

        }else if(v instanceof Switch){
            Switch view = (Switch) v;
            switch (type){
                case 0:view.setTypeface(myFontNormal);
                    break;
                case 1:view.setTypeface(myFontNormalItatic);
                    break;
                case 2:view.setTypeface(myFontBold);
                    break;
                case 3:view.setTypeface(myFontBoldItatic);
                    break;
            }

        }else if(v instanceof ToggleButton){
            ToggleButton view = (ToggleButton) v;
            switch (type){
                case 0:view.setTypeface(myFontNormal);
                    break;
                case 1:view.setTypeface(myFontNormalItatic);
                    break;
                case 2:view.setTypeface(myFontBold);
                    break;
                case 3:view.setTypeface(myFontBoldItatic);
                    break;
            }

        }else if(v instanceof CheckedTextView){
            CheckedTextView view = (CheckedTextView) v;
            switch (type){
                case 0:view.setTypeface(myFontNormal);
                    break;
                case 1:view.setTypeface(myFontNormalItatic);
                    break;
                case 2:view.setTypeface(myFontBold);
                    break;
                case 3:view.setTypeface(myFontBoldItatic);
                    break;
            }
        }

    }


//    public static String convertStreamToString(InputStream is) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//        StringBuilder sb = new StringBuilder();
//        String line;
//        while ((line = reader.readLine()) != null) {
//            sb.append(line).append("\n");
//        }
//        return sb.toString();
//    }

        private static Hashtable<String, Typeface> fontCache = new Hashtable<String, Typeface>();
        public static Typeface getFont(String name, Context context) {
            Typeface tf = fontCache.get(name);
            if(tf == null) {
                try {
                    tf = Typeface.createFromAsset(context.getAssets(), name);
                }
                catch (Exception e) {
                    return null;
                }
                fontCache.put(name, tf);
            }
            return tf;
        }


}



