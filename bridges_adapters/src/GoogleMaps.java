import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa {

    @Override
    public String devolveMapa(String rua) {
        try {
            String googleMaps = "https://maps.google.com.br/mapas?q=rua+vergueiro";
            URL url = new URL(googleMaps);
            InputStream openStream = url.openStream();

            return "mapa";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
