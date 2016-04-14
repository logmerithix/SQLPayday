import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Alexander on 14/04/2016.
 */


public class PaydayDatabaseHelper extends SQLiteOpenHelper{

    private final static String DB_NAME = "Payday";
    private final static int DB_VERSION = 1;

    public PaydayDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, factory, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE HEISTER"
        + "(_id INTEGER PRIMARY KEY AUTOINCREMENT"
        + "NAME TEXT, "
        + "MASK TEXT, "
        + "RECORD_NUM INTEGER PRIMARY KEY, "
        + "PAYDAY REAL);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
