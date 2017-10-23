package fr.eni.ecole.projetlocation.dao.icontract;

/**
 * Created by Administrateur on 20/10/2017.
 */
public class IVehiculeDao {
    public static final String TABLE_VEHICULES = "vehicules";
    public static final String COLUMN_ID_VEHICULES = "id";
    public static final String COLUMN_PRIX_VEHICULES = "prix";
    public static final String COLUMN_IMMATRICULATION_VEHICULES = "immatriculation";
    public static final String COLUMN_TYPE_VEHICULES = "type";
    public static final String COLUMN_MARQUE_VEHICULES = "marque";
    public static final String COLUMN_MODEL_VEHICULES = "model";
    public static final String COLUMN_CARBURANT_VEHICULES = "crburant";



    public static final String CREATE_TABLE_VEHICULES= "create table "
            + TABLE_VEHICULES + "(" + COLUMN_ID_VEHICULES
            + " integer primary key autoincrement, " + COLUMN_IMMATRICULATION_VEHICULES
            + " text not null, "+ COLUMN_TYPE_VEHICULES
            + " integer not null, "+ COLUMN_MARQUE_VEHICULES
            + " text not null, "+ COLUMN_MODEL_VEHICULES
            + " text not null, "+ COLUMN_CARBURANT_VEHICULES
            + " text not null, "+ COLUMN_PRIX_VEHICULES
            + " integer not null"
            + ");";
}
