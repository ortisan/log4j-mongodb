import com.mongodb.DB;
import com.mongodb.MongoClient;

public class TesteDb {

    public static void main(String[] args) throws Exception {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        // or, to connect to a replica set, with auto-discovery of the primary, supply a seed list of members

        DB db = mongoClient.getDB("logs");


        System.out.println("db = " + db);
    }

}
