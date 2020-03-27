package ServicesImpl;

import Models.Ruta;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManejadorRutas implements Services.ManejadorRutas {
    @Override
    public List<Ruta> getRutas() {
        List<Ruta> rutaList = new ArrayList<>();
        try {
            BufferedReader br = Files.newBufferedReader(Paths.get("rutas.txt"));

            String st;
            String[] csv;
            while ((st = br.readLine()) != null) {
                csv = st.split(",");
                rutaList.add(new Ruta(Integer.parseInt(csv[0]), csv[1], Integer.parseInt(csv[2])));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return rutaList;
    }
}
