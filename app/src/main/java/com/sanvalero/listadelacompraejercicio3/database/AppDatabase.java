package com.sanvalero.listadelacompraejercicio3.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.sanvalero.listadelacompraejercicio3.dao.ProductDao;
import com.sanvalero.listadelacompraejercicio3.domain.Product;

@Database(entities = {Product.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ProductDao productDao();
}
