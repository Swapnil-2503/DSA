import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class firststep{
    public static void main(String[] args) throws NoSuchAlgorithmException{
        String msg="This message is to hash";
        MessageDigest messageDigest=MessageDigest.getInstance("SHA-256");
        byte[] digest=messageDigest.digest(msg.getBytes());

        System.out.println("Message: "+msg);
        System.out.println("Digest: "+bytesToHex(digest));
    }

    private static String bytesToHex(byte[] digest){
        StringBuilder result = new StringBuilder();
        for (byte b : digest) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }
}