class Solution {
    public int romanToInt(String s) {
Hashmap <Character , Interger> map=new Hashmap<>();
map.put('I',1);
map.put('V',5);
map.put('X',10);
map.put('L',50);
map.put('C',100);
map.put('D',500);
map.put('M',1000);
int total=0;
for(i=0;i<s.length();i++){
int current=map.get(S.charAt(i));{
if(i<s.length()-1 && current < map.get(S.charAt(i+1))){
total-=current;
} else
total+current;
}
}
return total;
}
}
