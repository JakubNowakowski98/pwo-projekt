package pwo.products;

import java.io.FileReader;
import pwo.products.Products_template;
import java.io.File;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Jakub Nowakowski
 */
public class Products {

    /**
     *
     * @return zwraca tablicę obiektów zawierających nazwę, wagę oraz wartość
     */
    public static Products_template[] set_products() {
        JSONParser parser = new JSONParser();
        int i = 0;
        try {
            /**
             *
             *
             * Ustawienie ścieżki do pliku oraz utworzenie tablicy obiektów
             */
            File directory = new File("products.json");
            JSONArray obj = (JSONArray) parser.parse(new FileReader(directory.getAbsolutePath()));
            Products_template[] products = new Products_template[obj.size()];
            /**
             *
             * Pętla przechodzi po elementach obiektu JSON - obj, wyłuskując
             * każdy z nich i dodając do finalnej tablicy obiektów products
             */
            for (Object o : obj) {
                JSONObject product = (JSONObject) o;
                products[i] = new Products_template((String) product.get("name"), ((Long) product.get("weight")).intValue(), ((Long) product.get("value")).intValue());
                i++;
            }
            return products;
        } /**
         *
         * wyłapywanie wyjątków
         *
         */
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
