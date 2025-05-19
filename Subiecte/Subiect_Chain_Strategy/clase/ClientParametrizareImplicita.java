package Subiecte.Subiect_Chain_Strategy.clase;

public class ClientParametrizareImplicita implements IClient{
    @Override
    public ICautare obtineCautare() {
        CautarePretMic cautarePret = new CautarePretMic(200);
        CautareMarime cautareMarime = new CautareMarime("43");

        cautarePret.setUrmatorulCriteriu(cautareMarime);

        return cautarePret;
    }
}
