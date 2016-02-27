public class Caesar {
    String mesage;
    private char abc [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','v','z'};
    void encode (String mesage, int n){
        this.mesage = mesage;
        StringBuilder encodeMesage = new StringBuilder(mesage);
        for (int i = 0; i < mesage.length(); i++) {
            char index = mesage.charAt(i);
            int number = Integer.valueOf(index - 'a');
            encodeMesage.setCharAt(i, abc[((number + n) % 26)]);
        }
        System.out.println(encodeMesage);
    }
    void decode (String mesage, int n){
        this.mesage = mesage;
        StringBuilder decodeMesage = new StringBuilder(mesage);
        for (int i = 0; i < mesage.length(); i++){
            char index = mesage.charAt(i);
            int number = Integer.valueOf(index - 'a');
            decodeMesage.setCharAt(i, abc[((number - n) % 26)]);
        }
        System.out.println(decodeMesage);
    }
    public static void main (String [] args){
        Caesar newMesage = new Caesar();
        newMesage.encode("aaa",2);
        newMesage.decode("ccc",2);
    }
}
