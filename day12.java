public class day12 {
public static void main(String[] args) {
    char[] ch = {'a','d','c','e','b'};
    System.out.println(searchAscii(ch,102));

}
static char searchAscii(char[]ch,int target){
    for(int i= 0;i<ch.length;i++){
        if(ch[i]==target){
            return ch[i];
        }
    }
    return '/';
}
}
