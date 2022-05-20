package com.example.spashscreen2.Model;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Database(entities = {Usuario.class, Puntuaciones.class}, version = 9, exportSchema = false)
public abstract class BaseDeDatos extends RoomDatabase {

    static Executor executor = Executors.newSingleThreadExecutor();
    private static volatile BaseDeDatos INSTANCIA;

    public abstract AppUsuarioDAO obtenerElementosDao();

    static BaseDeDatos obtenerInstancia(final Context context) {
        if (INSTANCIA == null) {
            synchronized (BaseDeDatos.class) {
                if (INSTANCIA == null) {
                    INSTANCIA = Room.databaseBuilder(context, BaseDeDatos.class, "elementos.db")
                            .fallbackToDestructiveMigration()
                            .addCallback(new Callback() {



                            })
                            .build();
                }
            }
        }
        return INSTANCIA;
    }





    @Dao
    interface AppUsuarioDAO {

        //// Puntuaciones

        @Insert
        void insertarPuntuacion(Puntuaciones puntuaciones);

        @Insert
        void insertarPuntuacionesList(List<Puntuaciones> puntuacionesList);

        @Delete
        void eliminarPuntuaciones(Puntuaciones puntuaciones);

        @Query("SELECT * FROM Puntuaciones WHERE username LIKE '%' || :t || '%'")
        LiveData<List<Puntuaciones>> buscar(String t);

        ///// Usuarios Login/Register

        @Insert
        void insertarUsuario(Usuario usuario);

        @Query("SELECT * FROM Usuario WHERE username = :username AND password = :password")
        Usuario autenticar(String username, String password);

        @Query("SELECT * FROM Usuario WHERE username = :username")
        Usuario comprobarNombreDisponible(String username);

        @Query("SELECT * FROM Puntuaciones")
        LiveData<List<Puntuaciones>> sacarPuntuaciones();
    }
}
