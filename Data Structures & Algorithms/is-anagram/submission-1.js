class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length!=t.length) return false;
        const map = new Map();

        for(let ch of s){
            map.set(ch, (map.get(ch) || 0)+1);
        }

        for(let ch of t){
            if(map.has(ch)){
                if(map.get(ch)>1) map.set(ch,map.get(ch)-1);
                else map.delete(ch);
            }
            else return false;
        }
        return true;
    }
}
