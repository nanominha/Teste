package br.com.databaseandroid.android.database.activity.config;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public final class ConfiguracaoFirebase {

    private static DatabaseReference referenciaFirebase;


    public static DatabaseReference getForebase(){


        if(  referenciaFirebase == null){

            referenciaFirebase = FirebaseDatabase.getInstance(),getReference();
        }


        return referenciaFirebase;
    }


}

