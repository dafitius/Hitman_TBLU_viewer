package Decoder.TBLU.BlockTypes;

import java.util.ArrayList;
import java.util.Map;

public class Block0_3 implements subBlock{

    private int blockType;
    private Map<String, ArrayList<String>> arrays;

    public Block0_3(){
        this.blockType = 3;
    }
    public Block0_3(Map<String, ArrayList<String>> arrays) {
        this.blockType = 3;
        this.arrays = arrays;
    }


    @Override
    public String toString() {
        if(arrays == null){
            return "";
        }else return "Block0_3{" +
                "arrays=" + arrays.toString() +
                '}';
    }

    @Override
    public int getType() {
        return blockType;
    }
}
