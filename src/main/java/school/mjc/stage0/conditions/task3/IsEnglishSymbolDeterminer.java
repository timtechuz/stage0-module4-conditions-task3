package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
    	if ((int)symbol >= 0 && (int)symbol <= 127) {
    		System.out.println("English");
    		//System.out.println((int)symbol);
    	} else {
    		System.out.println("Non English");
    		//System.out.println((int)symbol);
    	}
    }
    /**
    public static void main(String[] args) {
    	IsEnglishSymbolDeterminer esd = new IsEnglishSymbolDeterminer();
    	esd.isEnglishSymbol('с');
    	
    }
    **/
}

