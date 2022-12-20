package Variables;


import org.yaml.snakeyaml.Yaml;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;



public  class ObjectRepo {
    static String  filepath=  System.getProperty("user.dir")+ "/src/main/java/Variables/objectreponew.yaml";
    static Map<?,?> obj_map;
        public static void initilizedObjectProperty () {
            try {
                Reader fis = new FileReader(filepath);
                Yaml yml = new Yaml();
                obj_map = (Map<?,?>)yml.load(fis);
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
    public static String getElementProperty(String objectstring)
            {
                ObjectRepo.initilizedObjectProperty();
                Map<?, ?> map = (Map<?, ?>)obj_map.get(objectstring.split("\\.")[0]);
                
                return map.get(objectstring.split("\\.")[1]).toString();
                //return "hello I am there";
            }
}


