import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub=new BanqueWs().getBanqueServicePort();
        System.out.println(stub.convert(7600));
        Compte com=stub.getCompte(3);
        System.out.println(com.getCode());
        System.out.println(com.getSolde());

    }
}
