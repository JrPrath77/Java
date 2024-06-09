package packages.general;

public class Generator{
    char [] charArray = {'a', 'a', 'a', 'a', 'a', 'a', 'a'};
    int i = 6;
    public String generateId(){
        while(true){
            if(charArray[i] == 'z'){
                charArray[i] = 'a';
                i--;
            }else{
                charArray[i]++;
                i=6; 
                return String.valueOf(charArray[0]) + String.valueOf(charArray[1]) + String.valueOf(charArray[2]) + String.valueOf(charArray[3]) + String.valueOf(charArray[4]) + String.valueOf(charArray[5]) + String.valueOf(charArray[6]);
            }
        }
    }
}