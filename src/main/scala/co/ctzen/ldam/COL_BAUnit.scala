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
}

case class
COL_ZonaRestriccion(
                     override val uID: Oid,
                     override val nombre:  Option[String], //TODO lo cambian a obligatorio, pero no compila así.
                     tipoZonaRestriccion: COL_ZonaRestriccionTipo,
                     vigencia: Option[LocalDateTime]
                   ) extends COL_BAUnit

case class
COL_ZonaResponsabilidad(
                         override val uID: Oid,
                         override val nombre:  Option[String], //TODO lo cambian a obligatorio, pero no compila así.
                         tipoZonaResponsabilidad: COL_ZonaResponsabilidadTipo,
                         vigencia: Option[LocalDateTime]
                       ) extends COL_BAUnit

case class
COL_Predio(
            override val uID: Oid,
            override val nombre: Option[String],
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
            ubicacionCopropiedad: Option[COL_UbicacionEnCopropiedadTipo]
          ) extends COL_BAUnit

case class
COL_Terreno(
             override val uID: Oid,
             override val nombre: Option[String],
             area: LA_AreaValue,
             avaluoTerreno: Int,
             coberturaSuelo: COL_CoberturaSuelo,
             forma: COL_FormaTipo,
             usoActualSuelo: COL_UsoTipo
           ) extends COL_BAUnit

case class
COL_Construccion(
                  override val uID: Oid,
                  override val nombre: Option[String],
                  anioConstruccion: Option[LocalDateTime],
                  avaluoConstruccion: Int, //TODO, el tipo de dato está inventado.
                  numeroPisos: Int
                ) extends COL_BAUnit

case class
COL_UnidadConstruccion(
                        override val uID: Oid,
                        override val nombre: Option[String],

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
                        tipoServicioPublico: COL_ServicioPublicoTipo //Todo ???
                      ) extends COL_BAUnit


//////////////////////////////////////////////////////////////////////////////////////
