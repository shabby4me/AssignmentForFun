package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
		if(string1==null)
			return string2;
		if(string2==null)
			return string1;
        return string2+string1;
    }

    public char getChar(String string, int index) {
		if(string == null){
			System.out.println("Null ref should not be here!");
			return '\0';
		}
			
        return string.charAt(index);
    }

    public String iCantSee(String string) {
		if(string==null)
			return "";
		String blank= " ";
		String ret = "";
		for(int i=0;i<string.length();++i)
			ret+=blank;
        return ret;
    }

    public String loudAndClear(String string) {
		if(string == null)
			return null;
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
		if(string == null)
			return null;
		char[] charArrayString = string.toCharArray();
		
		for(int i=0;i<charArrayString.length;++i){
			if(Character.isUpperCase(charArrayString[i])){
				charArrayString[i] = Character.toLowerCase(charArrayString[i]);
			}else if(Character.isLowerCase(charArrayString[i])){
				charArrayString[i] = Character.toUpperCase(charArrayString[i]);
			}
		}
        return new String(charArrayString);
    }

    public String oneAtATime(String string1, String string2) {
		if(string1==null)
			return string2;
		if(string2==null)
			return string1;
        char[] string = new char[string1.length()+string2.length()];
		int smallerIndex = string1.length()<string2.length()?string1.length():string2.length();
		int i;
		for(i=0;i<smallerIndex;++i){
			string[i*2] = string1.charAt(i);
			string[i*2+1] = string2.charAt(i);
		}
		if(string1.length()<string2.length()){
			while(i+smallerIndex<string.length){
				string[i+smallerIndex] = string2.charAt(i);
				++i;
			}
		}else{
			while(i+smallerIndex<string.length){
				string[i+smallerIndex] = string1.charAt(i);
				++i;
			}
		}
		return new String(string);
    }
}
