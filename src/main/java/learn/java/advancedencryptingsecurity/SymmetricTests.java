//package learn.java.advancedencryptingsecurity;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import javax.crypto.*;
//import javax.crypto.spec.IvParameterSpec;
//import java.io.*;
//import java.security.InvalidAlgorithmParameterException;
//import java.security.InvalidKeyException;
//import java.security.NoSuchAlgorithmException;
//import java.security.SecureRandom;
//
///**
// * Created by dvorop on 17.02.2017.
// *
// */
//public class SymmetricTests {
//
//    @Test
//    public void generateARandeomAesKey() throws NoSuchAlgorithmException {
////        Generate a random AES key with static getInstance method
//        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
////        Initialization of key generator with key size 256 bits.
//        keyGenerator.init(256);
//
////        Generate secret key
//        SecretKey key = keyGenerator.generateKey();
////        Checks if algorithm accept 32 bytes or 256 bits.
//        Assert.assertEquals("AES",key.getAlgorithm());
//        Assert.assertEquals(32,key.getEncoded().length);
//    }
//
//    @Test
//    public void encryptAMessageWithAes() throws NoSuchAlgorithmException, IOException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeyException {
////        message for encription
//        String message = "Alice knows Bob's secret.";
//        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
//        keyGenerator.init(128);
//        SecretKey key = keyGenerator.generateKey();
////        to obtain an initialization vector we can use:
//        SecureRandom secureRandom = new SecureRandom();
////       SecureRandom put 16 encryptographically random bytes into buffer
//        byte[] buffer = new byte[16];
//        secureRandom.nextBytes(buffer);
////        use 16 random bytes for initialization vector
//        IvParameterSpec iv = new IvParameterSpec(buffer);
//        byte[] cipertext = encryptWithAes(message, key, iv);
//        String actualMessage = decryptWithAes(cipertext, key, iv);
//
//        Assert.assertEquals(message,actualMessage);
//    }
//
//    private byte[] encryptWithAes(String message, SecretKey key, IvParameterSpec iv) throws IOException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException {
////       Write a message to output stream
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
////        Before go out to output stream we should go to safer output stream
//        String transformation = "AES/CBC/PKCS5Padding";
//        Cipher aes = Cipher.getInstance(transformation);
//        aes.init(Cipher.ENCRYPT_MODE, key, iv);
//        CipherOutputStream cipherOutput = new CipherOutputStream(out, aes);
//        OutputStreamWriter writer = new OutputStreamWriter(cipherOutput);
//        try{
//            writer.write(message);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            writer.close();
//        }
//        return out.toByteArray();
//    }
//
////    decrypt key
//    private String decryptWithAes(byte[] cipertext, SecretKey key, IvParameterSpec iv)
//            throws NoSuchPaddingException, NoSuchAlgorithmException,
//            IOException, InvalidAlgorithmParameterException, InvalidKeyException {
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(cipertext);
//        Cipher aes = Cipher.getInstance("AES/CBC/PKCS5Padding");
//        aes.init(Cipher.DECRYPT_MODE, key, iv);
//        CipherInputStream cipherInputStream = new CipherInputStream(inputStream, aes);
//        InputStreamReader inputStreamReader = new InputStreamReader(cipherInputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        return bufferedReader.readLine();
//    }
//}
