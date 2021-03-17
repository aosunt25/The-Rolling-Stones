package edu.itesm.primerexamen

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
//import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class Album(val foto:Int, val titulo:String, val anio:Int, val description:String, val mensajeSecreto:String): Parcelable


