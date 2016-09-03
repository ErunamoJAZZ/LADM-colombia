package co.ctzen.ldam

import java.time.LocalDateTime

import co.ctzen.domain.AdministrativeDomain._
import co.ctzen.domain.types.Oid

/**
  * Created by cdsanchez on 3/09/16.
  */

/////////////////////////////////////////////////////////////////////////////
/**
  * Unidad administrativa básica para Colombia.
  */
trait COL_BAUnit {
  val uID: Oid
  val nombre: Option[String]
}

case class
COL_ZonaRestriccion(
                     override val uID: Oid,
                     override val nombre: String, //TODO lo cambian a obligatorio
                     tipoZonaRestriccion: COL_ZonaRestriccionTipo,
                     vigencia: Option[LocalDateTime]
                   ) extends COL_BAUnit

case class
COL_ZonaResponsabilidad(
                         override val uID: Oid,
                         override val nombre: String, //TODO lo cambian a obligatorio
                         tipoZonaResponsabilidad: COL_ZonaResponsabilidadTipo,
                         vigencia: Option[LocalDateTime]
                       ) extends COL_BAUnit

case class
COL_Predio(
            override val uID: Oid,
            override val nombre: Option[String],
            bienUsoPublico: COL_BienUsoPublico,
            destinoEconomico: COL_BAUso,
            FMI: Option[String],
            nomenclatura: Option[String],
            NUIP: Int,
            numeroPredial: Option[Int],
            predioTipo: Option[COL_predioTipo]
          ) extends COL_BAUnit

case class
COL_Terreno(
             override val uID: Oid,
             override val nombre: Option[String],
             area: Option[LA_AreaValue],
             usoActualSuelo: COL_BAUso,
             coberturaSuelo: COL_CoberturaSuelo
           ) extends COL_BAUnit

case class
COL_Construccion(
                  override val uID: Oid,
                  override val nombre: Option[String],
                  anioConstruccion: Option[LocalDateTime],
                  numeroPisos: Int
                ) extends COL_BAUnit

case class
COL_UnidadConstruccion(
                        override val uID: Oid,
                        override val nombre: Option[String],
                        area: LA_AreaValue,
                        nivel: Int,
                        puntuacion: Int,
                        servicioPublico: Boolean,
                        construccionTipo: COL_ConstruccionTipo,
                        tipologia: COL_TipologiaTipo,
                        usoActual: COL_BAUso,
                        elemento: COL_ElementoConstrTipo,
                        material: COL_MaterialConstTipo,
                        actividadEcono: COL_ActividadEconoTipo,
                        actividadEconoUnidad: COL_ActividadEconoSubTipo
                        //TODO en el modelo sale un -, es raro como está modelado.
                      ) extends COL_BAUnit


//////////////////////////////////////////////////////////////////////////////////////
