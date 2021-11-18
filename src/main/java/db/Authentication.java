package db;

public class Authentication {
    public boolean auth(Database db) {
        db.getDataFromUser();
        return true;
    }
}
