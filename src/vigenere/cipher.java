
package vigenere;


public class cipher {
  

    static String[] vigenere_matrix={
        "abcdefghijklmnopqrstuvwxyz",
        "bcdefghijklmnopqrstuvwxyza",
        "cdefghijklmnopqrstuvwxyzab",
        "defghijklmnopqrstuvwxyzabc",
        "efghijklmnopqrstuvwxyzabcd",
        "fghijklmnopqrstuvwxyzabcde",
        "ghijklmnopqrstuvwxyzabcdef",
        "hijklmnopqrstuvwxyzabcedfg",
        "ijklmnopqrstuvwxyzabcdefgh",
        "jklmnopqrstuvwxyzabcdefghi",
        "klmnopqrstuvwxyzabcdefghij",
        "lmnopqrstuvwxyzabcdefghijk",
        "mnopqrstuvwxyzabcdefghijkl",
        "nopqrstuvwxyzabcdefghijklm",
        "opqrstuvwxyzabcdefghijklmn",
        "pqrstuvwxyzabcdefghijklmno",
        "qrstuvwxyzabcdefghijklmnop",
        "rstuvwxyzabcdefghijklmnopq",
        "stuvwxyzabcdefghijklmnopqr",
        "tuvwxyzabcdefghijklmnopqrs",
        "uvwxyzabcdefghijklmnopqrst",
        "vwxyzabcdefghijklmnopqrstu",
        "wxyzabcdefghijklmnopqrstuv",
        "xyzabcdefghijklmnopqrstuvw",
        "yzabcdefghijklmnopqrstuvwx",
        "zabcdefghijklmnopqrstuvwxy",};

    public static int getPositionX(char k, String alphab){
        int i=0,n=alphab.length();
        for( i = 0; i < n ; i++ )
            if( k == alphab.charAt(i))
                return i;
        return i-1;
    }
    public static int getPositionY(char k, String []alphab){
        int i=0,n=alphab.length;
        for( i = 0; i < n ; i++ )
            if( k == alphab[i].charAt(0))
                return i;
        return i-1;
    }
    public static String vigenereEncrypt(String m,String k){
        String ret="";
        char aux=' ';
        int i=0,j=0,x=0,y=0,n=m.length(),k_len=k.length();
        
        for(i=0;i<n;i++,j++){
            if(i%k_len==0)
                j=0;
            
            x=getPositionX(k.charAt(j),vigenere_matrix[0]);        
            y=getPositionY(m.charAt(i),vigenere_matrix);
            
            aux=vigenere_matrix[y].charAt(x);
            ret+=aux;
        }
        return ret;
    }
    public static String vigenereDecrypt(String c,String k){
        String ret="";
        char aux=' ';
        int i=0,j=0,l=0,x=0,n=c.length(),k_len=k.length();
        boolean flag=false;
        
        for(i=0;i<n;i++,j++){
            if(i%k_len==0)
                j=0;
            
            x=getPositionX(k.charAt(j),vigenere_matrix[0]); 
            flag=false;
            for(l=0;l<vigenere_matrix.length && flag==false;l++){
                if(c.charAt(i) == vigenere_matrix[l].charAt(x)){
                    aux = vigenere_matrix[l].charAt(0);
                    flag=true;
                }                
            }
            
            ret+=aux;
        }
        return ret;
    }
  
}
