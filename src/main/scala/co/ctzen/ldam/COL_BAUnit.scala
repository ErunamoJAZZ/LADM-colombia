package co.ctzen.ldam

import java.time.LocalDateTime

import co.ctzen.domain.AdministrativeDomain._
import co.ctzen.domain.SpatialUnitDomain.LA_AreaValue
import co.ctzen.domain.types.{COL_BAUso, Oid}

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
  val party: Seq[COL_Party] // Asociación con la tabla COL_Party
  val rrr: Seq[COL_RRR] // Asociaciòn con la tabla COL_RRR TODO es obligatorio al menos uno
  val demanda: Seq[COL_Demanda] // Asociaciòn con COL_Demanda TODO verificar cardinalidad
  val administrativeSource: Seq[COL_AdministrativeSource] // Asociación con COL_AdministrativeSource TODO verifiar nombre
  val spatialSource: Seq[COL_SpatialSource] // Asociación con Spatial Source
  val spatialUnit: Seq[LA_SpatialUnit] // Asociación con LA_SpatialUnit
}

case class
COL_ZonaRestriccion(
                     override val uID: Oid,
                     override val nombre:  Option[String], //TODO lo cambian a obligatorio, pero no compila así.
                     override val party: Seq[COL_Party],
                     override val rrr: Seq[COL_RRR],
                     override val demanda: Seq[COL_Demanda],
                     override val administrativeSource: Seq[COL_AdministrativeSource],
                     override val spatialSource: Seq[COL_SpatialSource],
                     override val spatialUnit: Seq[LA_SpatialUnit],
                     tipoZonaRestriccion: COL_ZonaRestriccionTipo,
                     vigencia: Option[LocalDateTime]
                   ) extends COL_BAUnit

case class
COL_ZonaResponsabilidad(
                         override val uID: Oid,
                         override val nombre:  Option[String], //TODO lo cambian a obligatorio, pero no compila así.
                         override val party: Seq[COL_Party],
                         override val rrr: Seq[COL_RRR],
                         override val demanda: Seq[COL_Demanda],
                         override val administrativeSource: Seq[COL_AdministrativeSource],
                         override val spatialSource: Seq[COL_SpatialSource],
                         override val spatialUnit: Seq[LA_SpatialUnit],
                         tipoZonaResponsabilidad: COL_ZonaResponsabilidadTipo,
                         vigencia: Option[LocalDateTime]
                       ) extends COL_BAUnit

case class
COL_Predio(
            override val uID: Oid,
            override val nombre: Option[String],
            override val party: Seq[COL_Party],
            override val rrr: Seq[COL_RRR],
            override val demanda: Seq[COL_Demanda],
            override val administrativeSource: Seq[COL_AdministrativeSource],
            override val spatialSource: Seq[COL_SpatialSource],
            override val spatialUnit: Seq[LA_SpatialUnit],
            acceso: COL_AccesoTipo,
            actividadEconomica: COL_ActividadEconoTipo,
            actividadEconomicaSub: COL_ActividadEconoSubTipo,
            aprovechamiento: COL_AprovechamientoTipo,
            avaluoPredio: Int,
            bienUsoPublico: Option[COL_BienUsoPublicoTipo],
            capaVegetal: Option[COL_CapaVegetalTipo],
            cercaniaHitos: COL_CercaniaHitosTipo,
            comunUsoExclusivo: Seq[COL_ComunExclusivoTipo], //[0..*]
            destinoEconomico: COL_BAUso, //todo Ojo!
            disponibilidadAgua: COL_DisponibilidadAguaTipo,
            estilo: COL_EstiloTipo,
            FMI: Option[String],
            Funcionalidad: COL_FuncionalidadTipo, //TODO F mayuscula?
            nomenclatura: Option[String],
            NUIP: Int,
            numeroPredial: Option[Int],
            obraAlInterior: COL_ObrasAlInteriorTipo,
            pendiente: COL_PendienteTipo,
            predioTipo: Option[COL_predioTipo],
            ubicacionCopropiedad: Option[COL_UbicacionEnCopropiedadTipo],
            construccion: Seq[COL_Construccion], // Asociación con COL_Construccion
            unidadConstruccion: Seq[COL_UnidadConstruccion], // Asociación con COL_UnidadConstruccion
            terreno: COL_Terreno // Asociación con COL_Terreno 1..1
          ) extends COL_BAUnit

case class
COL_Terreno(
             override val uID: Oid,
             override val nombre: Option[String],
             override val party: Seq[COL_Party],
             override val rrr: Seq[COL_RRR],
             override val demanda: Seq[COL_Demanda],
             override val administrativeSource: Seq[COL_AdministrativeSource],
             override val spatialSource: Seq[COL_SpatialSource],
             override val spatialUnit: Seq[LA_SpatialUnit],
             area: LA_AreaValue,
             avaluoTerreno: Int,
             coberturaSuelo: COL_CoberturaSuelo,
             forma: COL_FormaTipo,
             usoActualSuelo: COL_UsoTipo,
             predio: COL_Predio // Asociación con COL_Predio 1..1
           ) extends COL_BAUnit

case class
COL_Construccion(
                  override val uID: Oid,
                  override val nombre: Option[String],
                  override val party: Seq[COL_Party],
                  override val rrr: Seq[COL_RRR],
                  override val demanda: Seq[COL_Demanda],
                  override val administrativeSource: Seq[COL_AdministrativeSource],
                  override val spatialSource: Seq[COL_SpatialSource],
                  override val spatialUnit: Seq[LA_SpatialUnit],
                  anioConstruccion: Option[LocalDateTime],
                  avaluoConstruccion: Int, //TODO, el tipo de dato está inventado.
                  numeroPisos: Int,
                  unidadConstruccion: Seq[COL_UnidadConstruccion], // Asociación con COL_UnidadConstrucción TODO es obligatorio que exista al menos un elemento
                  predio: Seq[COL_Predio] // Asociación con COL_Predio
                ) extends COL_BAUnit

case class
COL_UnidadConstruccion(
                        override val uID: Oid,
                        override val nombre: Option[String],
                        override val party: Seq[COL_Party],
                        override val rrr: Seq[COL_RRR],
                        override val demanda: Seq[COL_Demanda],
                        override val administrativeSource: Seq[COL_AdministrativeSource],
                        override val spatialSource: Seq[COL_SpatialSource],
                        override val spatialUnit: Seq[LA_SpatialUnit],
                        actividadEcono: COL_ActividadEconoTipo,
                        actividadEconoUnidad: COL_ActividadEconoSubTipo,
                        alturaEntrePlacas: COL_AlturaEntrePlacasTipo,
                        anioconstruccion: LocalDateTime, //TODO, No hace el camelCase
                        area: LA_AreaValue,
                        avaluoUnidadCons: Int,
                        construccionTipo: COL_ConstruccionTipo,
                        elemento: COL_ElementoConstrTipo,
                        estadoConservacion: COL_EstadoConservacionTipo,
                        material: COL_MaterialConstTipo,
                        niveldeAcceso: Int, //TODO, no hace camelCase
                        numeroPisos: Int,
                        puntuacion: Int,
                        servicioPublico: Boolean,
                        tipoConstruccion: COL_TipoConstruccionTipo,
                        tipologia: COL_TipologiaTipo,
                        tipoServicioPublico: COL_ServicioPublicoTipo, //Todo ???
                        predio: COL_Predio, // Asociación con COL_Predio 1..1
                        construccion: COL_Construccion // Asociación con COL_Construccion 1..1
                      ) extends COL_BAUnit


//////////////////////////////////////////////////////////////////////////////////////
