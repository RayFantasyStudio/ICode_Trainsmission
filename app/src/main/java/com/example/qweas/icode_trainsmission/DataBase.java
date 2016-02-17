package com.example.qweas.icode_trainsmission;

/**
 * Created by qweas on 2016/2/17 0017.
 *
 */
import com.raizlabs.android.dbflow.annotation.Database;
@Database(version = DataBase.VERSION, name = DataBase.NAME, generatedClassSeparator = "_")
public class DataBase  {
    public static final String NAME = "icode_tran";
    public static final int VERSION = 1;
}
