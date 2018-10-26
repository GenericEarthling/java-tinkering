/**
 * 
 */
package javaapi;

import java.lang.Character.UnicodeBlock;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LangCharacter {

    public static void main(String[] args) {
//        Character.UnicodeBlock cub = new Character.UnicodeBlock();
//        Character.Subset cs = new Character.Subset();
//        Character cub = new Character();
    
        List<String> ls = new ArrayList<>();
        ls = tokenize("Sharon");
        for(String s : ls)
            System.out.println(s);
        UnicodeBlock ub = UnicodeBlock.of('c');
        System.out.println(ub);
//        for(String c : ub)
//            System.out.println(c);
    }
    public static List<String> tokenize(String text) {
	int beginIndex = -1;
	UnicodeBlock current = null;
	List<String> list = new LinkedList<>();
	for (int i = 0; i < text.length(); i++) {
		UnicodeBlock block = UnicodeBlock.of(text.charAt(i));
		if (current != block) {
			if (beginIndex >= 0) {
				list.add(text.substring(beginIndex, i));
			}
			beginIndex = i;
			current = block;
		}
	}
	if (beginIndex >= 0) {
		list.add(text.substring(beginIndex));
	}
	return list;
}
    
}
