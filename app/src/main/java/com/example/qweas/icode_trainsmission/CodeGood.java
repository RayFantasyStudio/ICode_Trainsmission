package com.example.qweas.icode_trainsmission;

import android.support.annotation.NonNull;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.sql.language.Delete;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.io.Serializable;

/**
 * Created by qweas on 2016/2/17 0017.
 */
@Table(name = "code_good", database = DataBase.class)
public class CodeGood extends BaseModel implements Serializable {
    @PrimaryKey
    String Title;

    @Column
    String Message;

    @Column
    String User;

    @Column
    String TitleMessage;


}
