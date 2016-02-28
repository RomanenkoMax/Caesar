public class Caesar {
    String mesage;
    private char abc [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    void encode (String mesage, int n){
        this.mesage = mesage.toLowerCase();
        StringBuilder encodeMesage = new StringBuilder(mesage);
        for (int i = 0; i < mesage.length(); i++) {
            char index = this.mesage.charAt(i);
            if (index == ' '){
                encodeMesage.setCharAt(i, ' ');
                continue;
            } else {
            int number = index - 'a';
            encodeMesage.setCharAt(i, abc[((number + n) % 26)]);
            }
        }
        System.out.println(encodeMesage);
    }
    void decode (String mesage, int n){
        this.mesage = mesage.toLowerCase();
        StringBuilder decodeMesage = new StringBuilder(mesage);
        for (int i = 0; i < mesage.length(); i++){
            char index = this.mesage.charAt(i);
            if (index == ' '){
                decodeMesage.setCharAt(i, ' ');
                continue;
            } else {
                int number = index - 'a';
                if ((number - n) < 0) decodeMesage.setCharAt(i, abc[(26 - n + number)]);
                else decodeMesage.setCharAt(i, abc[(number - n) % 26]);
                //System.out.println(abc[(number - n) % 26]);
                //System.out.println(number);
                //System.out.println(mesage);
                //System.out.println(n);
            }
        }
        System.out.println(decodeMesage);

    }
    public static void main (String [] args){
        Caesar newMesage = new Caesar();
        newMesage.encode("text for Encoding", 5);
        newMesage.decode("yjcy ktw Jshtinsl", 5);

    }

}
