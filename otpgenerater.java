import java.util.Random;

public class otpgenerater {
    public static void main(String[] args) {
        int length = 4;
        System.out.println(otp(length));
    }
    static char[] otp(int len){
        System.out.println("Generating OTP using rendom(): ");
        System.out.println("Your OTP is: ");

        //The OTP contains only numeric values.So we are using all the number of the generating OTP... 
        String number="0123456789";

        //Using random method...
        Random ra=new Random();
        char[]otp=new char[len];

        for(int i=0;i<len;i++){
            otp[i]=number.charAt(ra.nextInt(number.length()));
        }
        return otp;

    }
}
