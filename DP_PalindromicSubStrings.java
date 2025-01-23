class Solution {
    public int countSubstrings(String s) {

        char[] charArray = s.toCharArray();
        int count = 0;

        // for odd length
        int ol = 0;
        int or = 0;
        int el=0;
        int er=0;
        for (int i = 0; i < charArray.length; i++) {
            ol = i;
            or = i;
            el = i;
            er = i + 1;
            
            while (ol >= 0 && or < charArray.length) {
                if (charArray[ol] == charArray[or]) {
                    count++;
                }
                else{
                    break;
                }
                ol--;
                or++;
            }while (el >= 0 && er < charArray.length) {
                if (charArray[el] == charArray[er]) {
                    count++;
                }
                else{
                    break;
                }
                el--;
                er++;
            }
        }
        
        return count;

    }
}
