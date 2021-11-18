package db;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authentication authentication = new Authentication();
        if (authentication.auth(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
