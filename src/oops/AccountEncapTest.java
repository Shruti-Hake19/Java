package oops;

public class AccountEncapTest {

    public static void main(String[] args) {
        AccountEncapEx2 a1 = new AccountEncapEx2();

        a1.setName("Rajveer");
        a1.setEmail("raj@gmail.com");
        a1.setAccNo(39389165);
        a1.setAmount(50500);

        System.out.println("name is :" + a1.getName() + " Email is: " + a1.getEmail() + " Acc no. is: "+  a1.getAccNo() + " Amount is : " + a1.getAmount());
    }

}


