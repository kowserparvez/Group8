package Home;

import base.CommonAPI;
import utility.DataReader;
import java.io.IOException;

public class ItemSearched extends CommonAPI{
        DataReader dr = new DataReader();
        public String[] getDataFromExcelFile() throws IOException {
            String path = System.getProperty("user.dir")+"data/List.xls";
            String [] data = dr.fileReader2 ( path ,1 );
            return data;
        }

        public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
            String path = System.getProperty("user.dir")+"data/List.xls";
            String [] data = dr.fileReader2 ( path ,1 );
            return data;
        }
    }

