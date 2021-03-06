package ca.uwaterloo.sh6choi.korea101r.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Samson on 2015-09-23.
 */
public class DictationWord {

    @SerializedName("hangul")
    private String mHangul;

    @SerializedName("definition")
    private String mDefinition;

    public String getHangul() {
        return mHangul;
    }

    public String getDefinition() {
        return mDefinition;
    }
}
