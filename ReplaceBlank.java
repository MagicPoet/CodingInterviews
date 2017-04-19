public class ReplaceBlank {
    public static void ReplaceBlank(String testString) {
        if(testString == null || testString.length() <= 0){
            return;
        }
        int originalLength = testString.length();
        int numberOfBlank = 0;
        for(int i = 0;i<testString.length();i++){
            String tempString = String.valueOf(testString.charAt(i));
            if(tempString.equals(" ")){
                numberOfBlank++;
            }
        }
        int indexNewLength = originalLength + numberOfBlank * 2;
        System.out.println("替换空格前的字符串：");
        printArray(testString.toCharArray());
        char[] temp=new char[indexNewLength];
        System.arraycopy(testString.toCharArray(), 0, temp, 0, testString.toCharArray().length);
        int indexOfOriginal = originalLength-1;
        int indexOfNew = indexNewLength-1;
        while(indexOfOriginal >=0 && indexOfOriginal != indexOfNew){
            if(temp[indexOfOriginal]==' '){
                temp[indexOfNew--]='0';
                temp[indexOfNew--]='2';
                temp[indexOfNew--]='%';
            }else{
                temp[indexOfNew--]= temp[indexOfOriginal];
            }
            indexOfOriginal--;
        }
        System.out.println("替换空格后的字符串：");
        printArray(temp);
    }

    static void printArray(char[] testArray){
        for(char i :testArray){
            System.out.print(i);
        }
        System.out.println();
    }
    public static void main(String args[]) {
        String testString = "hello new world!";
        ReplaceBlank(testString);
    }
}
