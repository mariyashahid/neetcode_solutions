class Solution {
    public String longestPalindrome(String s) {

        char[] charArray = s.toCharArray();
        int lengt = 0;
        int finl = 0;
        int finr = 0;
        StringBuilder res = new StringBuilder();
        // for odd length
        int ol = 0;
        int or = 0;
        int el = 0;
        int er = 0;
        for (int i = 0; i < charArray.length; i++) {
            ol = i;
            or = i;
            el = i;
            er = i + 1;

            while (ol >= 0 && or < charArray.length && (charArray[ol] == charArray[or])) {

                if (or - ol + 1 > lengt) {
                    finl = ol;
                    finr = or;
                    lengt=or-ol+1;
                }
                ol--;
                or++;
            }
            while (el >= 0 && er < charArray.length && (charArray[el] == charArray[er])){
                if (er - el + 1 > lengt) {
                    finl = el;
                    finr = er;
                    lengt=er-el+1;
                }
            el--;
            er++;
        }
        }
        while (finl <= finr) {
            res.append(charArray[finl]);
            finl++;

        }
        return res.toString();
    }

}
