package Oops.Encapsulation;

public class NetBanking {
    public static void main(String[] args) {
        Bank user=new Bank();
        /*
        System.out.println(user.bal);
        System.out.println(user.acNo);
        System.out.println(user.add);
        user.add="Kanpur";
        System.out.println(user.add);
        user.bal=60000;
        System.out.println(user.bal);
        */

        System.out.println(user.getAcNo());
        System.out.println(user.getAdd());
        user.setAdd("Banaras");
        System.out.println(user.getName());
        user.setName("Abhay");
    }
}
